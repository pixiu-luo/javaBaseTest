package com.org.example.executordemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/9/3 15:50 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class TestCallable_new {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callable =
                new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        return "2333";
                    }
                };
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<String> result = executor.submit(callable);
        System.out.println(result.get());
    }
}
