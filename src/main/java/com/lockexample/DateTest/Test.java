package com.lockexample.DateTest;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/12/28 14:37 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class Test {
    public static void main(String[] args) {

        ArrayList<String> list =
                Lists.newArrayList(
                        "XY2020120900001-1",
                        "XY2020120900001-2",
                        "XY2020120900001-10",
                        "XY2020120900001-5",
                        "XY2020120900001-101");

        list.stream().map(item -> CompletableFuture.runAsync(() ->
                        System.out.println("传入service.function"),
                ExecutorUtil.getCommonThreadPollExecutor())).collect(Collectors.toList());

    }
}
