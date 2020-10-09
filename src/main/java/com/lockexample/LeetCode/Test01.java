package com.lockexample.LeetCode;

/**
 * 1 1 2 1 2 3 1 2 3 4...
 * 输入一个数字，输出该位的数字
 * 例： 5 2 ；2 1
 */
public class Test01 {

    public static void main(String[] args) {
        System.out.println(sortTest(5));
    }

    public static int sortTest(int n){
        if (n < 0) {
            return 0;
        }
        int m = 0;
        for (int i = 1; i < n; i++) {
            m += i;
            if (m == n) {
                return i;
            }else if (m > n) {
                m = m-i;
                break;
            }
        }
        return Math.abs(m-n);
    }
}
