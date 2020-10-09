package com.lockexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test04 {
    public static void main(String[] args) {
        List aa = new ArrayList();
        aa.add("22");
        aa.add("33");
        aa.add("44");
        aa.add("55");
        aa.add("66");
        aa.add("77");
        for (int i = 0; i < aa.size(); i++) {
            aa.remove("55");
        }
        System.out.println(aa);

        Map bb = new HashMap<>();
        for (int i = 0; i < bb.size(); i++) {
            bb.put("11","111");
            bb.put("22","222");
            bb.put("33","333");
            bb.put("44","444");
            bb.put("55","555");
            bb.remove("44");
        }
        System.out.println(bb);
    }
}
