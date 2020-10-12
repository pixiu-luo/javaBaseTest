package com.org.jvmdemo;

import com.google.common.collect.Maps;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/9/21 17:49 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class MapTest {

    public static void main(String[] args) {
        Map<String, BigDecimal> receiveAmountMap = Maps.newHashMap();
        receiveAmountMap.put("aa", BigDecimal.valueOf(10));
        receiveAmountMap.put("bb", BigDecimal.valueOf(10));
        receiveAmountMap.put("cc", BigDecimal.valueOf(10));
        //System.out.println((Optional.ofNullable(receiveAmountMap.get("dd"))).orElse(BigDecimal.ZERO));
        //Optional.ofNullable(receiveAmountMap.get("dd"))).orElse(BigDecimal.ZERO)
        int aa = 3;
        int bb = 4;

        String str1 = "1231872587152";
        String str2 = "72587152";

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        int max = Math.max(chars1.length, chars2.length);

        float sss  = 3/2;

        float s1 = 3;
        float s2 = 2;
        System.out.println(s1/s2);


    }
}
