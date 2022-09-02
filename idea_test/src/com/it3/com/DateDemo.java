package com.it3.com;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        long s = 1000*60*60;
        Date d1 = new Date(s);
        System.out.println(d1);
    }
}
