package com.org.didiShare.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/9/27 10:27 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class ParallelStream {

    public static void main(String[] args) {
        List result = new ArrayList<>();
        List tmpList = new ArrayList<>();

        tmpList.parallelStream().forEach(item->{
            result.add(item);
        });

        Runtime.getRuntime().availableProcessors();

        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism","12");

    }

}
