package com.org.jvmdemo;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/9/27 10:20 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class TestsStr {
    public static void main(String[] args) {
        String str = "asdkagshvda'\'aaa'\'aaa";
        int i = str.lastIndexOf("'\'aaa");
        System.out.println(i);

    }
}
