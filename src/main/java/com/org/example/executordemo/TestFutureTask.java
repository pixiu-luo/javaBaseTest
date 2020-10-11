package com.org.example.executordemo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/9/3 16:03 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class TestFutureTask {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<String> futureTask = new FutureTask<>(() -> "2333");

        Thread T1 = new Thread(futureTask);
        T1.start();

        String result = futureTask.get();
        System.out.println(result);
    }
}
