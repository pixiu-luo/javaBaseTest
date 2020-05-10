package com.lockexample.javaTest;

public class Father {
    public Father() {
        System.out.println("父类构造方法");
    }

    {
        System.out.println("父类代码块");
    }

    static {
        System.out.println("父类静态代码块");

    }
}
