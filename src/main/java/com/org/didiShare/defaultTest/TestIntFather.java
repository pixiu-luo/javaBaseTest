package com.org.didiShare.defaultTest;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/10/19 22:48 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public interface TestIntFather {

    void apply();

    default void  compose() {

        System.out.println("接口默认方法");
    }

}
