package com.org.example.executordemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/9/3 15:57 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class TestFuture {
    public static void main(String[] args) {
        Callable<String> callable =
                new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        return "2333";
                    }
                };
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<String> result = executor.submit(callable);
        result.cancel(true);
        System.out.println(result.isCancelled());
    }
}
