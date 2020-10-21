package com.org.didiShare.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/10/12 13:55 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class LimitOrSkip {

    /**
     * 这是一个有10，000个元素的Stream，但在short-circuiting操作limit和skip的作用下，
     * 管道中map操作指定的getName()方法的执行次数为 limit 所限定的10次，
     * 而最终返回结果在跳过前3个元素后只有后面7个返回。
     *
     * 有一种情况是limit/skip无法达到short-circuiting目的的，
     * 就是把它们放在Stream的排序操作后，原因跟sorted这个intermediate操作有关：
     * 此时系统并不知道Stream排序后的次序如何，所以sorted中的操作看上去就像
     * 完全没有被limit或者skip一样
     *
     * @param args
     */

    public static void main(String[] args) {

        yesLimitOrSkip();

    }

    //limit 和 skip 对运行次数的影响
    public static void testLimitAndSkip() {

        List<Person> persons = new ArrayList();
        for (int i = 1; i <= 10000; i++) {
            Person person = new Person(i, "name" + i);
            persons.add(person);
        }
        List<String> personList2 = persons.stream().
                map(Person::getName).limit(10).skip(3).collect(Collectors.toList());
        System.out.println(personList2);
    }

    private static class Person {
        public int no;
        private String name;
        public Person (int no, String name) {
            this.no = no;
            this.name = name;
        }
        public String getName() {
            System.out.println(name);
            return name;
        }
    }

    public static void yesLimitOrSkip() {
        // limit 和 skip 对 sorted 后的运行次数无影响
        List<Person> persons = new ArrayList();
        for (int i = 1; i <= 5; i++) {
            Person person = new Person(i, "name" + i);
            persons.add(person);
        }
        List<Person> personList2 = persons.stream()
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(personList2);
    }

}
