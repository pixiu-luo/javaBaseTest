package com.springcloudexample.demo;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/10/23 16:19 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class Test {

    public static void main(String[] args) {

        List<String> aaa = Lists.newArrayList("qq", "ww");
        ArrayList<Integer> bbb = Lists.newArrayList(1, 2);
        StringBuffer param = new StringBuffer();
        bbb.forEach(item -> param.append(item).append(","));
        System.out.println(param.substring(0, param.length() - 1));

    }


    public static String query(String q, List<String> engines) {
        Optional<String> result = engines.stream().parallel().map((base) -> {
            String url = base + q;
            //return WS.url(url).get();
            return "ai";
        }).findAny();
        return result.get();
    }
}


