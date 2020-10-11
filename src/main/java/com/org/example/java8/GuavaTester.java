package com.org.example.java8;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @name: test
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/6/4 18:59 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class GuavaTester {
    public static void main(String[] args) {

        List<Integer> intList = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8);

        test1(intList);


    }

    public static void test1(List intList){

        List<List<Integer>> subSets = Lists.partition(intList, 3);

        List<Integer> lastPartition = subSets.get(2);
        List<Integer> expectedLastPartition = Lists.<Integer>newArrayList(7, 8);

        System.out.println(subSets);

        System.out.println(lastPartition);
        System.out.println(expectedLastPartition);
    }

}
