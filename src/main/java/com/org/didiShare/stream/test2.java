package com.org.didiShare.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/9/25 17:16 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class test2 {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        // 获取空字符串的数量
        long count = strings.parallelStream()
                .filter(string -> string.isEmpty())
                .count();

        strings.forEach(item->{
            item.replace("a","啊");
        });



        System.out.println(count);

    }

}
