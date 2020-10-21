package com.org.classload;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/9/17 13:36 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */

class Father2 {

    public static String strFather = "HelloJVM_Father";

    static {
        System.out.println("Father静态代码块");
    }

}

class Son2 extends Father2 {
    public static String strSon = "HelloJVM_Son";

    static {
        System.out.println("Son静态代码块");
    }
}

public class InitativeUseTest2 {
    public static void main(String[] args) {

        System.out.println(Son2.strSon);
    }
}

