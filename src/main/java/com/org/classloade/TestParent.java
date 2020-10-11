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
public class TestParent {

    public TestParent() {//构造函数
        System.out.println("构造函数P");
    }

    {
        System.out.println("构造代码块P");
    }

    static {
        System.out.println("静态代码块P");
    }

    public static void main(String[] args) {

    }


}
