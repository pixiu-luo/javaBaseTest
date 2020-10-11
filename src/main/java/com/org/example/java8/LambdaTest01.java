package com.org.example.java8;

import java.util.LinkedList;
import java.util.List;

public class LambdaTest01 {

    static class Person{
        int a;
        List list;

        public Person() {
        }


        public Person(int a, List list) {
            this.a = a;
            this.list = list;
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public List getList() {
            return list;
        }

        public void setList(List list) {
            this.list = list;
        }
    }

    public static void main(String[] args) {
        List list = new LinkedList<>();
        Person person = new Person();
        person.setList(list);
        System.out.println(list.size());
    }


}
