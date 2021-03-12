package com.springcloudexample.demo;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2021/2/5 16:55 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class ReentranLockTest {
    final private LinkedList linkedList = new LinkedList<>();
    final private int MAX = 10;
    private int count = 0;

    private ReentrantLock lock = new ReentrantLock();
    private Condition prod = lock.newCondition();
    private Condition conm = lock.newCondition();

    public void put() {
        lock.lock();
        try {
            while (linkedList.size() == MAX) {
                conm.await();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
