package com.org.example.bigdecimal;

import org.example.comparebojo.People;

import java.util.Objects;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/7/8 15:31 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class test2 {
    public static void main(String[] args) {
        People people = new People();
        boolean aa = true;
        System.out.println(Objects.isNull(people));
        System.out.println(Objects.isNull(people.getAa()));

        if (Objects.isNull(people) || Objects.isNull(people.getAa())) {
            System.out.println("laila");
        }
    }

    public static boolean bb() {
        System.out.println("hahaha");
        return true;
    }
}
