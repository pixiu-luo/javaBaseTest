package com.org.example.bigdecimal;

import com.google.common.collect.Lists;
import com.org.example.comparebojo.People;
import com.org.example.comparebojo.PeopleT;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.BeanUtils;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/7/8 15:31 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class test3 {
    public static void main(String[] args) {
        /*String aa = "1";
        BigDecimal BB = new BigDecimal(aa);
        System.out.println(BB);*/
        //bb();
        System.out.println(NumberUtils.INTEGER_ZERO);
        System.out.println(Lists.newArrayList().size());

    }

    public static boolean bb() {
        People people = new People();
        people.setAa("11.11");
        people.setBb(11);
        System.out.println(people);
        PeopleT peopleT = new PeopleT();
        BeanUtils.copyProperties(people,peopleT);
        System.out.println(peopleT);
        return true;
    }
}
