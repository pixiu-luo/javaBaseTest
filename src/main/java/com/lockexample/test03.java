package com.lockexample;


import java.util.HashMap;
import java.util.Map;

public class test03 {
    public static void main(String[] args) {
        String[] aa = {"11","22","22","11","33","11"};

        Map a = new HashMap<>();
        for (int i = 0,m=aa.length; i < m; i++) {
            if (a.containsKey(aa[i])) {
                Object v = a.get(aa[i]);
                a.put(aa[i],(int)v+1);
            }else{
                a.put(aa[i],1);
            }
        }

        /*Iterator<Map.Entry<Integer, String>> it = a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            Object value = entry.getValue();
            int m = Integer.valueOf(value.toString());
            if (m == 1) {
                it.remove();// 使用迭代器的remove()方法删除元素
            }
        }*/


        System.out.println(a);
    }

}
