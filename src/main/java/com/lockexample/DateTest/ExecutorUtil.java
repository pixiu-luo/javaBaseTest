package com.lockexample.DateTest;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/12/28 14:39 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class ExecutorUtil {

    private static volatile ExecutorService executor = null;

    public static ExecutorService getCommonThreadPollExecutor() {
        if (Objects.isNull(executor)) {
            executor = getFixedThreadPollExecutor(64);
        }
        return executor;
    }

    private static ThreadPoolExecutor getFixedThreadPollExecutor(int expectedPoolSize) {
        //处理器核数 * CPU期望利用率 * (1 + 期望的等待时间与计算时间比值)
        Double reasonablePoolSize = (Runtime.getRuntime().availableProcessors() * 0.8 * (1 + 10));
        int pollSize = Math.min(reasonablePoolSize.intValue(), expectedPoolSize);
        return new ThreadPoolExecutor(pollSize, pollSize,
                0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(), new ThreadFactory() {
            @Override
            public Thread newThread(Runnable task) {
                Thread thread = new Thread(task);
                //设置为守护线程，程序退出后也会自动被回收
                thread.setDaemon(Boolean.TRUE);
                return thread;
            }
        });
    }
}
