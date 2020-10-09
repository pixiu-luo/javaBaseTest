package com.lockexample.java8;

public class Test {
    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a*100);
            }
        };
        System.out.println(formula.calculate(9));
        System.out.println(formula.sqrt(25));

    }
}
