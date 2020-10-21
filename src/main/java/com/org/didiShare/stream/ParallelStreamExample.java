package com.org.didiShare.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.groupingBy;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/10/12 16:53 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class ParallelStreamExample {

    //我们根据处理它们的线程来对将数字分组

    public static void main(String[] args) {

        testUrl();

    }

    public static void testInt() {
        Map<String, List<Integer>> numbersPerThread = IntStream.rangeClosed(1, 160)
                .parallel()
                .boxed()
                .collect(groupingBy(i -> Thread.currentThread().getName()));

        numbersPerThread.forEach((k, v) -> System.out.println(String.format("%s >> %s", k, v)));

    }

    public static void testUrl() {
        String[] urls = {"https://www.google.co.in/", "https://twitter.com/", "http://www.facebook.com/"};
        Arrays.stream(urls).parallel().map(url -> getUrlContent(url)).forEach(System.out::println);

    }

    private static Object getUrlContent(String url) {
        return url.replace("https://","");
    }


}
