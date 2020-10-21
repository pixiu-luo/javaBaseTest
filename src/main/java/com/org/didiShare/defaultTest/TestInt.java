package com.org.didiShare.defaultTest;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/10/19 22:50 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class TestInt implements TestIntFather {


    @Override
    public void apply() {
        System.out.println("test");
    }


    public static void main(String[] args) {
        TestIntFather testIntFather = new TestInt();
        testIntFather.apply();
        testIntFather.compose();
    }
}
