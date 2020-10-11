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
public class TestB {

    //静态块,main(),构造块,构造方法

    public TestB() {//构造函数
        System.out.println("构造函数B");
    }

    {
        System.out.println("构造代码块B");
    }

    static {
        System.out.println("静态代码块B");
    }

    public static void main(String[] args) {
        TestA testA = new TestA("aaa");
        
    }


}
