package com.org.javaInnerClass.java7;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/10/22 22:34 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class InnerClass {

    public InnerAnonymous innerAnonymous = new InnerAnonymous() {
        @Override
        public void functionA() {
            System.out.println("匿名内部类的作用。。。");

        }
    };

    public void selfFunction() {
        System.out.println("自己的方法");
    }

}
