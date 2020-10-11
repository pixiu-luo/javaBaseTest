package com.org.example.comparebojo;

import io.swagger.annotations.ApiModelProperty;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


/**
 * @name: aaaa
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/6/12 18:11 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class compareContract {


    public static void main(String[] args) {
        /*public String aa;
        private int bb;

        public int cc;

        public int ee;*/
        People p1 = new People();
        p1.setAa("1");
        p1.setBb(111);
        p1.setCc(111);
        p1.setEe(2);

        /*public int aa;
        public String bb;

        public int cc;

        private int dd;*/
        PeopleTwo p2 = new PeopleTwo();
        p2.setAa(1);
        p2.setBb(null);
        p2.setCc(111);
        p2.setDd(2);

        //System.out.println(compareStringBuilder(p1, p2).toString());
        System.out.println(compareMap(p1, p2).toString());

    }


    public static StringBuilder compareStringBuilder(People source, PeopleTwo exist) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            Field[] fields = source.getClass().getDeclaredFields();
            Field[] fieldsTwo = exist.getClass().getDeclaredFields();
            Method[] methods = People.class.getMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(ApiModelProperty.class)) {
                    ApiModelProperty name = method.getAnnotation(ApiModelProperty.class);
                }
            }
            for (int j = 0, m = fields.length; j < m; j++) {
                fields[j].setAccessible(true);
                fieldsTwo[j].setAccessible(true);
                // 字段值
                if (!fields[j].get(source).equals(fieldsTwo[j].get(exist))) {
                    //stringBuilder.append(fields[j] + " ");
                    stringBuilder.append(fields[j].getName() + "、");
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return stringBuilder;

    }

    public static Map compareMap(People source, PeopleTwo exist) {
        //StringBuilder stringBuilder = new StringBuilder();
        Map codeMap = new HashMap();
        try {
            Field[] fields = source.getClass().getDeclaredFields();
            Field[] fieldsTwo = exist.getClass().getDeclaredFields();
            for (int j = 0, m = fields.length; j < m; j++) {
                fields[j].setAccessible(true);
                fieldsTwo[j].setAccessible(true);
                // 字段值
                // equeals 的判空
                if (!fields[j].get(source).equals(fieldsTwo[j].get(exist))) {
                    //stringBuilder.append(fields[j] + " ");
                    //stringBuilder.append(fields[j].getName() + "、");
                    codeMap.put(fields[j].getName(), fields[j].get(source));
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(codeMap.containsKey("aa"));
        return codeMap;


    }


}
