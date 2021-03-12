package com.lockexample.DateTest;

import com.google.common.collect.Lists;

import java.math.BigDecimal;
import java.util.List;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/12/18 14:54 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class CalendarTest {
    public static void main(String[] args) {

        System.out.println(BigDecimal.ZERO.multiply(BigDecimal.ZERO)
                .setScale(2, BigDecimal.ROUND_HALF_UP));

        System.out.println("qqq".equals(null));

        List<String> value = null;
        List<String> goods = Lists.newArrayList();
        value.stream().filter(item -> {
            goods.add(item);
            return false;
        });


    }
}
