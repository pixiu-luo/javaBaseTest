package com.org.example.leecode;

/**
 * @name: aa
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/6/15 12:44 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arg = {"flower", "flow", "flight"};
        String[] arg1 = {"dog", "racecar", "car"};
        String[] arg3 = {"dog"};
        String[] arg4 = {"a"};
        String[] arg5 = {};
        String[] arg6 = {"", "aaa"};
        String[] arg7 = {"aaa", "", "aa"};
        System.out.println(subString(arg7));
    }

    public static String subString(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        String angs = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < angs.length() && j < strs[i].length(); j++) {
                if (angs.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            angs = strs[i].substring(0, j);
        }
        return angs;

    }
}
