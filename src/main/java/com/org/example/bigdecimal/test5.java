package com.org.example.bigdecimal;

import com.org.example.comparebojo.People;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/7/8 15:31 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class test5 {
    public static void main(String[] args) {
        People people = null;
        System.out.println(Optional.ofNullable(people.getAa()).orElse("aa"));
    }

}
