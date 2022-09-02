package com.it25;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test19 {
    public static void main(String[] args) throws ParseException {
//        格式化：Date-》String 将日期格式化成日期/时间字符串
        Date d = new Date();
//        无参构造使用默认模式和日期格式
//        SimpleDateFormat sdk = new SimpleDateFormat();
        SimpleDateFormat sdk = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s = sdk.format(d);
        System.out.println(s);
//        解析：String-》Date
        String ss = "2022-02-20 08:56:56 666";
        SimpleDateFormat sdk1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date dd = sdk1.parse(ss);
        System.out.println(dd);
    }
}
