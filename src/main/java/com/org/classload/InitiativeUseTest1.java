package com.org.classload;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/9/17 13:38 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
class YeYe1{
    static {
        System.out.println("YeYe静态代码块");
    }
}

class Father1 extends YeYe1{
    public final static String strFather="HelloJVM_Father";

    static{
        System.out.println("Father静态代码块");
    }
}

class Son1 extends Father1{
    public static String strSon="HelloJVM_Son";

    static{
        System.out.println("Son静态代码块");
    }
}

public class InitiativeUseTest1 {
    public static void main(String[] args) {
        System.out.println(Son1.strFather);
    }
}
