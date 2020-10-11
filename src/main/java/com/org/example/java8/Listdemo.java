package com.org.example.java8;

import com.google.common.collect.Lists;

import java.math.BigDecimal;
import java.util.List;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/9/2 17:48 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class Listdemo {
    public static void main(String[] args) {
        List<BigDecimal> rate = Lists.newArrayList();
        BigDecimal bigDecimal1 = new BigDecimal("1.000");
        BigDecimal bigDecimal2 = new BigDecimal("2.00");
        BigDecimal bigDecimal3 = new BigDecimal("3.0");

        rate.add(bigDecimal1);
        rate.add(bigDecimal2);
        rate.add(bigDecimal3);

        List<BigDecimal> rate1 = Lists.newArrayList();

        for (BigDecimal bigDecimal : rate) {
            BigDecimal bigDecimal4 = bigDecimal.setScale(8, BigDecimal.ROUND_HALF_UP);
        }

        for (int i = 0, m = rate.size(); i < m; i++) {
            rate.get(i).setScale(8, BigDecimal.ROUND_HALF_UP);
        }

        System.out.println(rate);
        System.out.println(rate1);

    }
}
