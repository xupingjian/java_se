package com.it4;

import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        String s1 = DateUtils.dataToString(d, "yyyy年MM月dd日 HH:mm:ss");
        String s2 = DateUtils.dataToString(d, "yyyy年MM月dd日");
        System.out.println(s1);
        System.out.println(s2);

        String s ="2020-08-02 12:12:12";
//        将日期字符串解析成日期对象
        Date dd = DateUtils.stringToDate(s,"yyyy-MM-dd HH:mm:ss");
        System.out.println(dd);
    }
}
