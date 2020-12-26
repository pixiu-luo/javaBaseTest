package com.springcloudexample.demo;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/10/27 11:37 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class TestMap {
    public static void main(String[] args) {
        Map<String, List<String>> map = Maps.newHashMap();
        List<String> ss = Lists.newArrayList("qq", "ww");
        String key = "Test";
        for (int i = 0; i < 5; i++) {
            if (!map.containsKey(key)) {
                map.put(key, Lists.newArrayList());
            }
            map.get(key).add("newAA");
        }
        System.out.println(map);
        System.out.println("**********");
        map.forEach((k, v) -> {
            System.out.println(k + "--" + v);
        });
    }
}
