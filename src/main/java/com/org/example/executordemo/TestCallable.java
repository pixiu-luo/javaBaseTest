package com.org.example.executordemo;


import java.util.List;
import java.util.concurrent.Callable;

/**
 * @author huxuewei
 * @description
 * @date 2020-08-07
 */
public class TestCallable implements Callable<Integer> {

    private List<Double> list;

    private ThreadLocal threadLocal;

    public TestCallable(List<Double> list, ThreadLocal threadLocal) {
        this.list = list;
        this.threadLocal = threadLocal;
    }

    @Override
    public Integer call() {
        for (Double item : this.list) {
            System.out.println(threadLocal + "do send mq");
        }
        System.out.println(threadLocal + "do update status");
        return 1;
    }
}
