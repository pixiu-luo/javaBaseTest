package com.org.example.executordemo;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/9/3 14:43 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class TestRunnable {
    public static void main(String[] args) {
        Runnable runnable =
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("2333");
                    }
                };

        /*Thread thread = new Thread(runnable);
        thread.start();*/

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }


    }
}
