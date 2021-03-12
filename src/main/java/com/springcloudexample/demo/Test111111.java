package com.springcloudexample.demo;

import feign.Request;
import feign.RetryableException;

import java.util.Date;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2021/2/25 15:58 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class Test111111 {
    public static void main(String[] args) {
        try {
            Request.HttpMethod a = null;
            Request reques = null;
            Date d = new Date();
            throw  new RetryableException(1,"", a , d, reques);
        } catch (RetryableException retryableException){
            System.out.println("小异常");
        } catch (Exception ex) {
            System.out.println("大异常");
        }
    }
}
