package com.lockexample.DateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/12/18 11:45 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class Test2 {
    public static void main(String[] args) throws ParseException {
        /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = new Date();
        Date dateq = new Date();
        Date et = sdf.parse("2020-12-18 00:00:00");
        System.out.println(date.compareTo(et));

        Date current = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(current);
        calendar.add(Calendar.DATE, 1);
        current = calendar.getTime();
        System.out.println(current + "  **  ");*/

        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        Date dateq = new Date();
        Date et = sdf.parse("2020-12-22");
        String format = sdf.format(new Date());


        Date date1 = new Date();
        Calendar calendar1 = new GregorianCalendar();
        calendar1.setTime(date1);
        calendar1.add(Calendar.DATE, 1);
        date1 = calendar1.getTime();

        Date date2 = new Date();
        System.out.println(date2.compareTo(et));

    }
}
