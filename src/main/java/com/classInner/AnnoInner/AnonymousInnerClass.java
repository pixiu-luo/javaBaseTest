package com.classInner.AnnoInner;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/10/13 14:22 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class AnonymousInnerClass {
    /*Java的内部类和C++中的嵌套类有本质的不同：
    C++的嵌套类没有指向包装类的句柄。仅仅表达一个封装的概念；
    但是Java的内部类不同，它可以访问包装类的成员（这表示它拥有指向包装类的句柄）。
    匿名内部类是内部类的一种简化写法：return new Wrapper {
       ...
    };
    等价于：Wrapped extends Wrapper {
       ...
    }
    return new Wrapped();*/
}
