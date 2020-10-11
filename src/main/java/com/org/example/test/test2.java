package com.org.example.test;

/**
 * @name: aa
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/6/16 20:48 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class test2 {

    public static void main(String[] args) {
        //testBreak();
        testContinue();
        //testReturn();
    }

    static void testBreak() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("i=" + i);
            } else {
                System.out.println("执行了break语句,跳出当前循环!");
                break;
            }
        }
    }

    static void testContinue() {
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 5; i++) {
                if (i % 2 == 0) {
                    System.out.println("没有执行continue语句输出i=" + i);
                } else {
                    System.out.println("执行了Continue语句,跳出当前循环!");
                    continue;
                }
            }
            System.out.println("外循环" + j);

        }

    }

    static void testReturn() {
        for (int i = 0; i < 10; i++) {
            System.out.println("执行了return语句,直接跳出了当前的testReturn方法!");
            return;
        }
    }
}
