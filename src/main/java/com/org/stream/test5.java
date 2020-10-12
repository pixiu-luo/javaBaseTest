package com.org.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/10/12 11:30 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class test5 {
    public static void main(String[] args) {

        // peek 对每个元素执行操作并返回一个新的 Stream
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

        /*Stream<String> peek = Stream.of("one", "two", "three", "four","kjkg")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase);

        peek.forEach(item->{
            System.out.println(item);
        });*/

    }
}
