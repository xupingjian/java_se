package com.it5;

import java.util.Calendar;
import java.util.Scanner;

public class tewmonth {
    public static void main(String[] args) {
        System.out.println("请输入任意的年份:");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        Calendar r = Calendar.getInstance();
        r.set(s,2,1);
        r.add(Calendar.DATE,-1);
        int year = r.get(Calendar.YEAR);
        int month = r.get(Calendar.MONTH) + 1;//月字段要加1
        int date = r.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");

    }


}
