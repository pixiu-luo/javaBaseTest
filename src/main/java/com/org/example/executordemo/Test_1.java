package com.org.example.executordemo;


import java.util.concurrent.ExecutionException;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/9/3 16:15 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class Test_1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Person p = new Person();
        p.setName("小明");

        /*ExecutorService executor = Executors.newFixedThreadPool(1);

        Future<Result> future = executor.submit(new Task(p), p);

        Person person = future.get();

        person.getSex();*/

    }
}

class Task implements Runnable{  //定义task,传入p
    Person p;
    Task(Person r){  // 通过构造函数传入 p
        this.p = p;
    }
    @Override
    public void run() {
        p.setSex("男");      // 可以修改p
    }
}



