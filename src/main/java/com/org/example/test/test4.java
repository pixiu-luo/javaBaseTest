package com.org.example.test;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

/**
 * @name: aa
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/6/16 20:48 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class test4 {

    public static void main(String[] args) {
        String str = "图片;链接:cloud-purchase-dev_5f05e149136e40b9a9f82858eda56d08.jpg修改为:cloud-purchase-dev_be6e68faaa6d49d9b8580e7be3675b70.jpg;商品介绍:<p>图书杂志'商品;介绍刘;靖<img src=\"cloud-purchase-dev_6257815832824d3088cf341c797903e4.jpg\"></p>修改为:图书杂志商";
        String str1 = "图片链接:cloud-purchase-dev_5f05e149136e40b9a9f82858eda56d08.jpg修改为:cloud-purchase-dev_be6e68faaa6d49d9b8580e7be3675b70.jpg";
        String str2 = "";
        subString(str);
    }

    public static void subString(String str) {
        List<String> list = Lists.newArrayList();
        String[] split = str.split(";");
        List<String> list1 = Arrays.asList(split);
        list1.forEach(item->{
            String[] split1 = item.split(":");
            list.add(split1[0]);
        });
        System.out.println(list);
    }
}
