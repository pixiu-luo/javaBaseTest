package com.org.example.comparebojo;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

/**
 * @name: aa
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/6/24 20:03 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class Test {
    public static void main(String[] args) {
        People people = new People();

        people.setAa("aaY");

        StringBuffer str = new StringBuffer();
        System.out.println(str.append(people.getAa()).append(people.getDd()).append(","));


    }


}
