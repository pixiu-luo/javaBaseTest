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
public class Test1111111 {

    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[]{2, 4};
        a[0] = 1;
        a[1] = 3;
        a[2] = 5;
        int[] oderS = oder(a, b);
        for (int i = 0; i < oderS.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] oder(int[] a, int[] b) {


        int lengthA = a.length;
        int lengthB = b.length;

        int aa = lengthA - lengthB - 1;
        int bb = lengthB - 1;

        for (int i = 0; i < lengthA; i++) {

            if (bb >= 0 && aa >= 0 && b[bb] >= a[aa]) {
                a[lengthA - i - 1] = b[bb];
                //这个时候a还取原来的结果
                bb--;
                continue;
            }
            if (bb >= 0 && aa >= 0 && b[bb] < a[aa]) {
                a[lengthA - i - 1] = a[aa];
                //这个时候b还取原来的结果
                aa--;
                continue;
            }
            if (aa < 0 && bb >= 0) {
                a[lengthA - i - 1] = b[bb];
            }
        }
        return a;
    }
}
