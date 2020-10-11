package com.org.freemarker;

import groovy.lang.GroovyClassLoader;
import org.apache.commons.lang3.reflect.FieldUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/10/9 10:15 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class testGroovyClasses {
    public static void main(String[] args) throws Exception {
        //groovy提供了一种将字符串文本代码直接转换成Java Class对象的功能
        GroovyClassLoader groovyClassLoader = new GroovyClassLoader();
        //里面的文本是Java代码,但是我们可以看到这是一个字符串我们可以直接生成对应的Class<?>对象,而不需要我们写一个.java文件
        Class<?> clazz = groovyClassLoader.parseClass("package org.freemarker;\n" +
                "\n" +
                "public class BaseModelDemo {\n" +
                "\n" +
                "    public int person_id;\n" +
                "    public String person_name;\n" +
                "    public int delete_flag;\n" +
                "    \n" +
                "    public void getPerson_id() {\n" +
                "        person_id;\n" +
                "    }\n" +
                "    public void setPerson_id(int person_id) {\n" +
                "        person_id = person_id;\n" +
                "    }\n" +
                "    public void getPerson_name() {\n" +
                "        person_name;\n" +
                "    }\n" +
                "    public void setPerson_name(String person_name) {\n" +
                "        person_name = person_name;\n" +
                "    }\n" +

                "    public void getDelete_flag() {\n" +
                "        delete_flag;\n" +
                "    }\n" +

                "    public void setDelete_flag(int delete_flag) {\n" +
                "        delete_flag = delete_flag;\n" +
                "    }\n" +

                "    public void sayHello() {\n" +
                "        System.out.println(\"年龄是:\" + age);\n" +
                "    }\n" +

                "}\n");

        Object obj = clazz.newInstance();

        Field[] declaredFields = clazz.getDeclaredFields();
        Field[] allFields = FieldUtils.getAllFields((Class<?>) clazz);

        for (int i = 0,m =declaredFields.length; i < m; i++) {
            System.out.println(declaredFields[i]);
        }

        String sql = "select person_id,person_name,delete_flag from person";

        List<Object> select = (List<Object>)OperationDBUtil.select(sql, clazz);


        Method method = clazz.getDeclaredMethod("sayHello");
        method.invoke(obj);

        Object val = method.getDefaultValue();

        System.out.println(val);

    }
}
