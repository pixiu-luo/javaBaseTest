package com.org.example.enumdemo;

/**
 * @name: aaaa
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/6/12 15:56 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class EnumDemo {
    public static void main(String args[]) {

        System.out.println("CellPhone List:");

        for (Mobile m : Mobile.values()) {
            System.out.println(m + " costs " + m.showPrice() + " dollars");
        }

        Mobile ret;
        // Samsung 这个是枚举常量
        ret = Mobile.valueOf("Samsung");
        System.out.println("Selected : " + ret);
    }
}
