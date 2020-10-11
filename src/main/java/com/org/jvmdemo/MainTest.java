package com.org.jvmdemo;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/9/2 14:15 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */

interface interTest{
    void show();
}

class Base{
    public int a;

    public Base(int a) {
        this.a = a;
    }
}

class A extends Base implements interTest  {
    public int b;
    public A(int a,int b) {
        super(a);
        this.b=b;
    }

    @Override
    public void show() {
        System.out.println("a->"+a+",b="+b);
    }
}

public class MainTest {
    public static void main(String[] args) {
        String s="shl";
        String[] s2={"shl","abc","bcd"};
        A a=new A(1,2);
        a.show();
        while (true){
            try {
                System.out.println(getProcessID());
                Thread.sleep(600*1000);
            } catch (Exception e) {

            }
        }
    }

    public static final int getProcessID() {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        System.out.println(runtimeMXBean.getName());
        return Integer.valueOf(runtimeMXBean.getName().split("@")[0])
                .intValue();
    }
}

