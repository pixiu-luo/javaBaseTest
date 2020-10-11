package com.org.jvmdemo;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/9/2 16:08 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class MetaspaceOverFlowTest {
    /**
     * 通过CGLIB模拟向元空间写入数据
     */
    public static void main(String[] args) {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Enhancer enhancer = new Enhancer();

            enhancer.setSuperclass(MetaspaceOverFlowTest.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                    return proxy.invokeSuper(obj, args);
                }
            });

            System.out.println("running...");

            enhancer.create();
        }
    }
}
