package com.lockexample.DesignPattern.CreateDesign;

/**
 * 原型模式（Protype）
 * 原型模式就是讲一个对象作为原型，使用clone()方法来创建新的实例。
 *
 * 此处使用的是浅拷贝，关于深浅拷贝，大家可以另行查找相关资料。
 */
public class Protype implements Cloneable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone()   {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }finally {
            return null;
        }
    }

    public static void main ( String[] args){
        Protype pro = new Protype();
        Protype pro1 = (Protype)pro.clone();
    }

}
