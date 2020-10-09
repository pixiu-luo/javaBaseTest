package com.lockexample.LeetCode;

import org.springframework.transaction.annotation.Transactional;

public class Test02 {
    public static void main(String[] args) {
        aa(254358);
    }
    @Transactional
    public static void aa(int a) {

        if (a > 999999 || a < 100000) {
            System.out.println();
            return;
        }
        Integer num = a;
        String str = num.toString();
        int[] n = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            n[i] = Integer.parseInt(ch.toString());
        }

        for (int i = 0; i < n.length; ++i) {
            for (int j = 0; j < n.length - i - 1; ++j) {
                if (n[j] > n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }
        if (n[0] > 2) {
            System.out.println();
            return;
        }
        if (n[1] > 4) {
            System.out.println();
            return;
        }

        if (n[1] <= 2) {
            System.out.println(n[0] + n[1] + ":" + n[2] + n[3] + ":" + n[4] + n[5] + " "
                    + n[1] + n[0] + ":" + n[5] + n[4] + ":" + n[3] + n[2]);
        } else {
            System.out.println(n[0] + n[1] + ":" + n[2] + n[3] + ":" + n[4] + n[5] + " "
                    + n[0] + n[1] + ":" + n[5] + n[4] + ":" + n[3] + n[2]);
        }

    }

}

