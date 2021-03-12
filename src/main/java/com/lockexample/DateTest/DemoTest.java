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
                Lists.newArrayList(
                        "XY2020120900001-1",
                        "XY2020120900001-2",
                        "XY2020120900001-10",
                        "XY2020120900001-5",
                        "XY2020120900001-101");
        //strings.stream().filter()

        List<String> collect1 = strings.stream()
                .sorted(Comparator.comparing(model -> {
                    int sub = model.lastIndexOf("-") + 1;
                    String substring = model.substring(sub);
                    return Integer.valueOf(substring);
                }, Comparator.reverseOrder())).collect(Collectors.toList());

        System.out.println(collect1);

        /*System.out.println(strings.size());
        System.out.println(strings.get(strings.size() - 2));
        List<String> collect = strings.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect);*/

    }
}
