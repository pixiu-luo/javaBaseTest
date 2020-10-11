package com.org.classloade;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/9/28 11:20 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class TestA {

    //静态块,main(),构造块,构造方法

    {
        System.out.println("构造代码块A2");
    }

    public TestA() {//构造函数
        System.out.println("构造函数A");
    }

    {
        System.out.println("构造代码块A1");
    }

    static {
        System.out.println("静态代码块A");
    }

    public TestA(String str) {//构造函数
        System.out.println("构造函数A" + str);
    }

    public static void main(String[] args) {
        System.out.println("main A");
    }


}
