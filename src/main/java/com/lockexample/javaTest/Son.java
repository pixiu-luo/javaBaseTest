package com.lockexample.javaTest;

public class Son extends Father {
    public Son() {
        System.out.println("子类构造方法");
    }

    {
        System.out.println("子类代码块");
    }

    static {
        System.out.println("子类静态代码块");
    }

    public static void main(String[] args) {
        new Son();
    }
}
