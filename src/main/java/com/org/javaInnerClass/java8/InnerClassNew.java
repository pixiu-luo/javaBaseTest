package com.org.javaInnerClass.java8;



/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/10/22 22:34 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class InnerClassNew {

    InnerAnonymousNew innerAnonymous = () -> {
        System.out.println("在自己的类中实现别的接口方法,用来实现真正的多继承");
        return 9;
    };

    public void selfFunction() {
        System.out.println("自己的方法");
    }

}
