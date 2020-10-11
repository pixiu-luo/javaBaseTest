package com.org.example.executordemo;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.apache.commons.collections.CollectionUtils;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/8/10 16:08 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class Test {

    private static ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
            .setNameFormat("consumer-queue-thread-%d").build();

    private static ExecutorService executorService = new ThreadPoolExecutor(
            5,
            5,
            0L,
            TimeUnit.MILLISECONDS,
            new ArrayBlockingQueue<Runnable>(5),
            namedThreadFactory,
            new ThreadPoolExecutor.AbortPolicy());

    //private static ExecutorService executorService = Executors.newFixedThreadPool(10);
    //private static fixedThreadPool =Executors.newFixedThreadPool();
    //private static ExecutorService executorService = executorService();

    private static ThreadLocal threadLocal;

    public static void sendMq() throws ExecutionException, InterruptedException {

        List<Double> doubles = Lists.newArrayList();

        for (int i = 0; i < 100; i++) {
            doubles.add(Math.random());
        }

        List<List<Double>> partition = Lists.partition(doubles, 10);

        List<FutureTask<Integer>> futureTasks = Lists.newArrayList();

        for (int i = 0; i < partition.size(); i++) {
            List<Double> list = partition.get(i);
            if (CollectionUtils.isNotEmpty(list)) {
                TestCallable callable = new TestCallable(list, threadLocal);
                FutureTask<Integer> futureTask = new FutureTask<Integer>(callable);
                executorService.submit(futureTask);
                futureTasks.add(futureTask);
            }
        }

        for (FutureTask<Integer> futureTask : futureTasks) {
            if (futureTask.get() > 0) {
                System.out.println("logs");
            }
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        sendMq();
    }
}
