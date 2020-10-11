package com.org.example.bigdecimal;

import java.math.BigDecimal;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/7/8 10:44 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class Test1 {
    public static void main(String[] args) {

        BigDecimal bigDecimal = convertStringToBigDecimal(null)
                .setScale(4, BigDecimal.ROUND_HALF_UP);
        System.out.println(bigDecimal);
    }

    public static BigDecimal convertStringToBigDecimal(String value) {
        BigDecimal target = new BigDecimal(0);
        if (value != null && !"".equals(value)) {
            target = new BigDecimal(value);
        }
        return target;
    }


}
