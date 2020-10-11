package com.org.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/9/27 10:46 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class PStream {
    //https://cloud.tencent.com/developer/article/1544929
    public static void main(String[] args) throws InterruptedException {

        final List<Integer> list = new ArrayList<>(100);

        for (int i = 0; i < 100; i++) {
            list.add(1);
        }

        for (int i = 1; i <= 50; i++) {
            new Thread("test-" + i) {
                String currentThreaName = this.getName();
                @Override
                public void run() {
                    list.parallelStream()
                            .forEach(numbser -> {
                                Thread c = Thread.currentThread();
                                System.out.println(currentThreaName + "===> "
                                        + c.getClass().getName() + ":" + c.getName() + ":" + c.getId());
                                try {
                                    Thread.sleep(10);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            });
                }
            }.start();
        }

        Thread.sleep(Integer.MAX_VALUE);
    }
}
