package com.org.didiShare.forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

import static java.util.stream.Collectors.toList;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/10/22 10:28 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class OwerFork {

    /**
     * 它可以是小于64的2的幂（我不知道为什么，但是它是（不超过ForkJoinPool的34个线程），但是如果不是2的幂，我们会得到奇怪的行为。
     * 为什么会这样？如何使用它？
     *
     * 在某些时候，某些线程被驻留，而其他线程则完成其余工作。当我查看转储时，我发现什么都不做的线程处于停车状态。
     * 实验表明，如果创建带有并行度参数的ForkJoinPool的2的幂，一切正常。
     *
     * 而不是实例化您自己的ForkJoinPool，您应该调用工厂方法ForJoinPool.commonPool（），该方法应与可用的内核适配。
     * 你可以试试看。
     * 无论如何，我认为您最好使用Executors.newFixedThreadPool（Runtime.getRuntime（）。availableProcessors（））。
     *
     * @param args
     * @throws ExecutionException
     * @throws InterruptedException
     */

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<String> activities = new ArrayList<>();

        for (int i = 0; i < 3000; i++) {
            activities.add(String.valueOf(i));
        }

        ForkJoinPool pool = new ForkJoinPool(16);

        pool.submit(() ->
                activities.parallelStream()
                        .map(s -> {
                            try {
                                System.out.println("Start task = " + s);
                                Thread.sleep(100);
                                System.out.println("End task = " + s);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            return s;
                        })
                        .collect(toList())
        ).get();
    }
}
