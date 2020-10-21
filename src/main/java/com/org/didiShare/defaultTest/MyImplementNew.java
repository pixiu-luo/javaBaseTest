package com.org.didiShare.defaultTest;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/10/19 23:14 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class MyImplementNew implements Interface1,Interface2{

    @Override
    public void helloGirl() {
        System.out.println("Suitor ganDie");
    }

    public static void main(String[] args) {
        Interface1 myImplement = new MyImplementNew();
        myImplement.helloGirl();
    }

}
