package com.org.didiShare.stream;

import java.util.stream.Stream;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/10/12 11:11 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class A_CreaterStream {

    public static void main(String[] args) {
        //ArryStream();
        NewStream();
    }

    //通过数组构造
    public static void ArrayStream() {
        String[] str = {"Hello World", "Jiaming Chen", "Zhouhang Cheng"};
        Stream<String> stream = Stream.of(str);
        stream.forEach(item -> {
            System.out.println(item);
        });
    }

    //通过单个元素构造
    public static void NewStream() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4);
        stream.forEach(item -> {
            System.out.println(item);
        });
    }

}
