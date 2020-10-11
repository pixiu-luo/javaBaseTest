package com.org.jvmdemo;

import java.util.Stack;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/9/19 8:06 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class StackTest {
    public static void main(String[] args) {

        System.out.println(fobanacci(5));

    }

    public static int fobanacci(int i){
        //初值进栈
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(0);
        stack.push(1);
        int a = 0;
        while (a < i) {

            int f2 = stack.pop();
            int f1 = stack.pop();
            int tmp = f1 + f2;

            stack.push(f1);
            stack.push(f2);
            stack.push(tmp);
            a++;
        }
        return stack.peek();
    }
}


class stack{
    int vn;
    int vf;
    int tag;

    public int getVn() {
        return vn;
    }

    public void setVn(int vn) {
        this.vn = vn;
    }

    public int getVf() {
        return vf;
    }

    public void setVf(int vf) {
        this.vf = vf;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }
}