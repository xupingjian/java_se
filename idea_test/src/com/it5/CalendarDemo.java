package com.it5;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
//        获取对象
        Calendar c = Calendar.getInstance();//多态的形式
//        System.out.println(c);
/*        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;//月字段要加1
        int date = c.get(Calendar.SECOND);
        System.out.println(year + "年" + month + "月" + date + "日");*/
//        需求10年后的前5天
 /*       c.add(Calendar.YEAR,10);
        c.add(Calendar.DATE,-5);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;//月字段要加1
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");*/
        c.set(2048, 11,11);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;//月字段要加1
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");
    }
}

