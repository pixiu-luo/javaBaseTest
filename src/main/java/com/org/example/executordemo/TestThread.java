package com.org.example.executordemo;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/9/3 17:13 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        //可以通过t.join()等待t线程结束后再继续运行
        //通过对另一个线程对象调用join()方法可以等待其执行结束；
        //可以指定等待时间，超过等待时间线程仍然没有结束就不再等待；
        //对已经运行结束的线程调用join()方法会立刻返回。
        //join(long)的重载方法也可以指定一个等待时间，超过等待时间后就不再继续等待。
        Thread t = new Thread(() -> {
            System.out.println("hello");
        });
        System.out.println("start");
        t.start();
        t.join();
        System.out.println("end");
    }
}
