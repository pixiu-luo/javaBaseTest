package com.org.example.java.base;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/7/15 9:17 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class Exceptiondemo {
    public static void main(String[] args) {
        try{
            throw new Exception("buzhid");
        }catch (Exception e){
            System.out.println("zheli");
        }
        System.out.println("zhixing");
    }
}
