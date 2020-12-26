package com.lockexample.DateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/12/19 19:46 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class Test0000 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");

        String systemTime = sdf.format(new Date());

        Date system = sdf.parse(systemTime);
        Date system1 = sdf.parse(systemTime);

        Date open1 = sdf.parse("2020-12-01 10:00:00");

        Date open = sdf1.parse("2020-12-01 00:00:00");


        System.out.println(open.compareTo(open1));

        //System.out.println(system.after(system1));
    }
}
