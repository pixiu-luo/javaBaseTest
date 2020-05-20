package com.lockexample.Thread;

import java.util.concurrent.Semaphore;

/**
 * 信号量.
 * 用完以后下一个人才能用
 */
public class SemaphoreTest {

    public static void main(String[] args) {
        int n = 8;
        Semaphore semaphore = new Semaphore(5);
        for (int i = 0; i < n; i++) {
            new Worker(i, semaphore).start();
        }
    }

    static class Worker extends Thread {

        int n;
        private Semaphore semaphore;

        public Worker(int n, Semaphore semaphore) {
            this.n = n;
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println("工人" + this.n + "占用一个机器在上产...");
                Thread.sleep(2000);
                System.out.println("工人" + this.n + "释放出机器");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
