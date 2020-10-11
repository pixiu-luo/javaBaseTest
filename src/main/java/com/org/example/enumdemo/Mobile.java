package com.org.example.enumdemo;

/**
 * @name: aa
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/6/12 15:54 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public enum Mobile {
    Samsung(400), Nokia(250), Motorola(325);

    int price;

    Mobile(int p) {
        price = p;
    }

    int showPrice() {
        return price;
    }
}
