package com.lockexample.Thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * CountDownLatch  线程计数器
 * 一个任务A 要等其他四个任务执行完后才执行
 */
public class CountDownLatchTest {

    public static void main(String[] args) throws InterruptedException {

        final CountDownLatch latch = new CountDownLatch(2);

        /*Thread a1 = ThreadPoolTest(latch);
        a1.start();

        Thread a2 = ThreadPoolTest(latch);
        a2.start();*/

        ThreadpoolTestTwo(1,latch);
        ThreadpoolTestTwo(2,latch);

        System.out.println("等待2子线程程序执行完毕...");

        latch.await();

        System.out.println("子线程程序执行完毕...");
        System.out.println("继续执行主线程");

    }

    public static Thread ThreadPoolTest(CountDownLatch latch) {
        Thread thread = new Thread() {
            public void run() {
                System.out.println("子线程" + Thread.currentThread().getName() + "正在执行");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("子线程" + Thread.currentThread().getName() + "正在执行");

                latch.countDown();
            }
        };

        return thread;
    }

    public static void ThreadpoolTestTwo(int index, CountDownLatch latch){
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("当前线程是：" + index);
                System.out.println("子线程" + Thread.currentThread().getName() + "正在执行");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("子线程" + Thread.currentThread().getName() + "正在执行");

                latch.countDown();
            }
        });
    }

}
