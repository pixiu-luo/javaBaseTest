package com.org.example.leecode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @name: 2
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/6/17 11:35 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int index = Arrays.binarySearch(nums, target);
        //System.out.println(index);
        int[] solution = solution(nums, target);
        for (int i : solution) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0, m = nums.length; i < m; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
