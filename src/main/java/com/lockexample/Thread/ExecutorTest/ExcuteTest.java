package com.lockexample.Thread.ExecutorTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExcuteTest {
    public static void main(String[] args) throws InterruptedException {
        /*线程池不允许使用Executors去创建，而是通过 ThreadPoolExecutor 的方式，
        这样的处理方式让写的同学更加明确线程池的运行规则，规避资源耗尽的风险。
        说明：Executors各个方法的弊端：
        1）newFixedThreadPool和newSingleThreadExecutor:
         主要问题是堆积的请求处理队列可能会耗费非常大的内存，甚至OOM。
        2）newCachedThreadPool和newScheduledThreadPool:
          主要问题是线程数最大数是Integer.MAX_VALUE，可能会创建数量非常多的线程，甚至OOM。*/


        //创建单核心的线程池
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        //创建固定核心数的线程池，这里核心数 = 2
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(2);
        //创建一个按照计划规定执行的线程池，这里核心数 = 2
        ExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        //创建一个自动增长的线程池
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        //创建一个具有抢占式操作的线程池
        ExecutorService workStealingPool = Executors.newWorkStealingPool();



        for (int i = 0; i < 10; i++) {
            int index = i;
            Thread.sleep(index * 10);
            threadpool(index);
        }
    }

    static void threadpool(int index) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("当前线程是：" + index);
            }
        });
    }
}
