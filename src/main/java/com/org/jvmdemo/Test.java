package com.org.jvmdemo;

import com.google.common.collect.Lists;
import org.apache.commons.collections.CollectionUtils;

import java.util.Collections;
import java.util.List;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/9/15 11:07 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class Test {
    public static void main(String[] args) {
        StringBuilder detail = new StringBuilder();
        // 修改正式表
        System.out.println(detail.toString());

        List<Test1> alist = Lists.newArrayList();
        List<String> blist = Lists.newArrayList();
        List<String> clist = Lists.newArrayList();

        Test1 test1 = new Test1();

        test1.setAa("aa");
        test1.setDd("dd");

        alist.add(test1);

        System.out.println("before : " + alist.get(0).getAa());
        //List<Test1> dlist = Lists.newArrayList(alist);
        List<Test1> dlist = Lists.newArrayList();

        /*dlist.addAll(alist);
        dlist.forEach(item->{
            item.setAa("aaaa");
        });*/

        /*alist.stream().forEach(item->{
            Test1 test2 = new Test1();
            test2.setAa(item.getAa());
            dlist.add(test2);
        });*/

        Collections.copy(alist,dlist);

        CollectionUtils.addAll(dlist, new Object[alist.size()]);
        Collections.copy(dlist, alist);

        System.out.println(alist);
        System.out.println(dlist);

        dlist.forEach(item->{
            item.setAa("aaaa");
        });


        System.out.println("after : " + alist.get(0).getAa());
        System.out.println("modifiy : " + dlist.get(0).getAa());
    }
}

class Test1{
    private String aa;
    private String dd;

    public String getAa() {
        return aa;
    }

    public void setAa(String aa) {
        this.aa = aa;
    }

    public String getDd() {
        return dd;
    }

    public void setDd(String dd) {
        this.dd = dd;
    }
}
