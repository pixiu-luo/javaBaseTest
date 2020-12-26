package com.org.didiShare.stream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/10/12 22:08 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class ArrayOrListOrMap {


    public static List<Apple> initList() {

        List<Apple> appleList = new ArrayList<>();//存放apple对象集合

        Apple apple1 = new Apple(1, "苹果1", new BigDecimal("3.25"), 10);
        Apple apple12 = new Apple(1, "苹果2", new BigDecimal("1.35"), 20);
        Apple apple2 = new Apple(2, "香蕉", new BigDecimal("2.89"), 30);
        Apple apple3 = new Apple(3, "荔枝", new BigDecimal("9.99"), 40);
        appleList.add(apple1);
        appleList.add(apple12);
        appleList.add(apple2);
        appleList.add(apple3);
        return appleList;
    }


    public static void main(String[] args) {
        //toMapOne(initList());
        toMapTwo(initList());
    }

    public static void testMap(List<Apple> appleList){
        Map<String, List<Apple>> collect = appleList.stream().collect(Collectors.groupingBy(Apple::getName));

    }

    //分组
    public static void toMapOne(List<Apple> appleList) {
        //List 以ID分组 Map<Integer,List<Apple>>
        Map<Integer, List<Apple>> groupBy = appleList.stream().collect(Collectors.groupingBy(Apple::getId));

        System.err.println("groupBy:"+groupBy);

        groupBy.forEach((k,v)->{
            v.forEach(item->{
                System.out.println(item.getMoney());
            });
        });

    }

    //List转Map

    /**
     * List -> Map
     * 需要注意的是：
     * toMap 如果集合对象有重复的key，会报错Duplicate key ....
     * apple1,apple12的id都为1。
     * 可以用 (k1,k2)->k1 来设置，如果有重复的key,则保留key1,舍弃key2
     */
    public static void toMapTwo(List<Apple> appleList) {

        //Map<Integer, Apple> appleMap = appleList.stream().collect(Collectors.toMap(Apple::getId, Function.identity(), (v1, v2) -> v1));

        Map<Integer, Apple> result = appleList.stream().collect(Collectors.toMap(e -> e.getId(), Function.identity()));

    }

    /**
     * Java8 List转为Map
     * ID 必须为唯一性
     *
     * @param list
     * @return
     */
    public static Map<Integer, User> listToMap1(List<User> list) {
        Map<Integer, User> result = list.stream().collect(Collectors.toMap(e -> e.getId(), Function.identity()));
        return result;
    }

    /**
     * Java8 List转为Map
     * ID 必须为唯一性
     *
     * @param list
     * @return
     */
    public static Map<Integer, User> listToMap2(List<User> list) {
        Map<Integer, User> result = list.stream().collect(Collectors.toMap(User::getId, user -> user));
        return result;
    }

    /**
     * Java8 List转为Map
     * ID重复分组
     *
     * @param list
     * @return
     */
    public static Map<Integer, List<User>> listToMap3(List<User> list) {
        Map<Integer, List<User>> result = list.stream().collect(Collectors.groupingBy(User::getId));
        return result;
    }

    /**
     * Java8 List转为Map
     * 根据年龄排序后，再根据ID重复分组
     *
     * @param list
     * @return
     */
    public static Map<Integer, List<User>> listToMap4(List<User> list) {
        Collections.sort(list, Comparator.comparing(User::getId).thenComparing(User::getAge));
        list.forEach(System.out::println);
        System.out.println("----------------");
        Map<Integer, List<User>> result = list.stream().collect(Collectors.groupingBy(User::getId));
        return result;
    }


}
