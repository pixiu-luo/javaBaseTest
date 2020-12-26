package com.lockexample.DateTest;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.util.Strings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/12/17 17:08 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class TestDate {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date bt = new Date();
        //System.out.println(bt);

        String format = sdf.format(new Date());
        //System.out.println(format);
        Date system = sdf.parse(format);
        //System.out.println(system);

        Date et = sdf.parse("2020-12-01 00:00:00");

        //Date et1 = sdf.parse(Strings.EMPTY);

        //System.out.println(et);

        System.out.println(system.after(system));


    }
}
