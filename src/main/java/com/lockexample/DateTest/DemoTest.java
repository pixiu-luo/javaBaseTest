package com.lockexample.DateTest;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/12/24 15:54 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class DemoTest {
    public static void main(String[] args) {
        ArrayList<String> strings =
                Lists.newArrayList("XY2020120900001-1",
                        "XY2020120900001-2",
                        "XY2020120900001-101",
                        "XY2020120900001-5");
        //strings.stream().filter()
        List<String> collect = strings.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect);

    }
}
