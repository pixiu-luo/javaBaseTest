package com.org.didiShare.stream;

import java.util.Arrays;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/9/27 11:19 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class test4 {

    //https://blog.csdn.net/g56467467464/article/details/105428838

    public static void main(String[] args) {
        //int[ ] 转 List< Integer >
        int[] ints = new int[5];
        Integer[] integers = Arrays.stream(ints).boxed().toArray(Integer[]::new);

    }

}
