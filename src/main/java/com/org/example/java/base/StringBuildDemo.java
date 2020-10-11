package com.org.example.java.base;

import org.example.comparebojo.People;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/8/6 16:24 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class StringBuildDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String aa = "aaa";
        String bb = stringBuilder.toString();
        People people = new People();
        people.setAa(bb);

        System.out.println(people.getAa() + aa);
    }
}
