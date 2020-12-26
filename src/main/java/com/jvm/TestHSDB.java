package com.jvm;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/11/13 13:43 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class TestHSDB {
    /**
     * HotSpot VM 运行时数据区测试类
     */

    static Test2 t1 = new Test2();
    Test2 t2 = new Test2();

    public void fn() {
        Test2 t3 = new Test2();
    }
}

class Test2 {

    public static void main(String[] args) {
        System.out.println("test2");
    }

}
