package com.org.lombadaTest;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/10/19 23:36 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class Quote {

    public static void main(String[] args) {
        test3();
    }

    public static void test0(){

        // 类：：静态方法名
        Comparator<Integer> bb = Integer::compare;
        System.out.println(bb.compare(3, 2));
        Comparator<Integer> cc = (x, y) -> Integer.compare(x, y);
        System.out.println(cc.compare(2,3));

        Comparator<Integer> dd = (x, y) -> x.compareTo(y);
        System.out.println(dd.compare(3, 2));
        Comparator<Integer> ee = Integer::compareTo;
        System.out.println(ee.compare(3, 2));

    }

    public static void test1(){
        // 类：：实例方法名
        BiPredicate<String, String> bp = (x, y) -> x.equals(y);
        System.out.println(bp.test("a", "b"));
        BiPredicate<String, String> bp1 = String::equals;
        System.out.println(bp1.test("a", "b"));
    }

    public static void test2(){
        // 对象：：实例方法名
        Consumer<String> con1 = x -> System.out.println(x);
        con1.accept("abc");
        Consumer<String> con = System.out::println;
        con.accept("abc");

        Emp emp = new Emp("上海", "xiaoMIng", 18);
        Supplier<String> supper1 = () -> emp.getAddress();
        System.out.println(supper1.get());
        Supplier<String> supper = emp::getAddress;
        System.out.println(supper.get());

    }

    public static void test3(){

        /*************** 构造器的引用 ****************/
        // 无参构造函数，创建实例
        Supplier<Emp> supper2 = () -> new Emp();
        Supplier<Emp> supper3 = Emp::new;
        Emp emp1 = supper3.get();
        emp1.setAddress("上海");
        // 一个参数
        Function<String, Emp> fun = address -> new Emp(address);
        Function<String, Emp> fun1 = Emp::new;
        System.out.println(fun1.apply("beijing"));
        // 两个参数
        BiFunction<String, Integer, Emp> bFun = (name, age) -> new Emp(name, age);
        BiFunction<String, Integer, Emp> bFun1 = Emp::new;
        System.out.println(bFun1.apply("beautiful girl", 18));

    }

    public static void test4(){
        BiFunction<String, Integer, Emp> bFun = (name, age) -> new Emp(name, age);
        BiFunction<String, Integer, Emp> bFun1 = Emp::new;
        Emp beautiful_girl = bFun1.apply("beautiful girl", 18);

    }

    public static void test5(){
        BiFunction<String, Integer, Emp> bFun1 = new BiFunction<String, Integer, Emp>() {
            @Override
            public Emp apply(String s, Integer integer) {
                return null;
            }
        };
        Emp beautiful_girl = bFun1.apply("beautiful girl", 18);

    }
}
