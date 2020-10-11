package com.org.jvmdemo;

import java.math.BigDecimal;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/9/17 17:52 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class TestFor {
    public static void main(String[] args) {
        BigDecimal aa = null;
        BigDecimal bb = null;

        if (bb == null) {
            System.out.println("hahaha");
        }

        loop:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                if (true) {
                    System.out.println("我来过" + i);
                    System.out.println(j);
                    continue loop;
                }
                System.out.println("能来这里么");
            }
        }
    }
}
