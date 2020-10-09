package com.lockexample.LeetCode;

import java.util.stream.IntStream;

public class Test {

    public static void main(String[] args) {
        int[][] n = {{2, 3, 1}, {1, 3, 2}, {3, 2, 1},};

        int solution = Solution(n, n.length, 0);

        System.out.println(solution);
    }

    public static int Solution(int[][] n, int l, int max) {
        if (n.length == 0 || n.length != n[0].length) {
            return max;
        }
        //最优值
        int i = l;
        int[][] mm = new int[i - 1][];
        if (i > 0) {
            //找出最大值及下标
            int[] nn = n[i - 1];
            int[] finalNn = nn;
            int index = IntStream.range(0, nn.length).reduce((m, j) -> finalNn[m] < finalNn[j] ? j : m).getAsInt();
            max += nn[index];
            i = l--;
            for (int j = i - 1; j > 0; j--) {
                mm[j - 1] = org.apache.commons.lang3.ArrayUtils.remove(nn, index);
            }
        }
        //递归求解
        max = Solution(mm, l, max);
        return max;
    }


}

