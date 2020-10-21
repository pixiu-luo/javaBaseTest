package com.lockexample;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/10/13 16:39 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class TestBigAdd {

    public static void main(String[] args) {

    }

    public static String bigAdd(String... str) {
        String[] strings = new String[str.length];
        StringBuilder strbuff = new StringBuilder();
        for (String string : strings) {
            char[] chars1 = string.toCharArray();
            if (strbuff == null) {
                strbuff.append(string);
                break;
            }
            char[] chars2 = strbuff.toString().toCharArray();
            strbuff.append(addChar(chars1, chars2));
        }
        return strbuff.toString();
    }

    public static String addChar(char[] chars1, char[] chars2) {
        StringBuilder str = new StringBuilder();
        boolean flag = true;
        for (int i = 0, m = Math.min(chars1.length, chars2.length); i < m; i++) {
            if ((chars1[i] + chars2[i]) > 9) {
                if (flag) {
                    str.append((chars1[i] + chars2[i]) - 10);
                } else {

                }
            }

        }
        return str.reverse().toString();
    }
}
