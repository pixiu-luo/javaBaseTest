package com.springcloudexample.demo;

import java.util.Arrays;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/11/23 17:11 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class TestString {
    public static void main(String[] args) {
        String filePath = ".css,.js,.png,.gift,.swf,.html,.htm,.ico";
        String apiPath = "/api/,/logout,/common,/project,/lib,/framwork";
        System.out.println((Arrays.asList(filePath)));
        System.out.println((Arrays.asList(apiPath)));
    }
}
