package com.it5;
import static java.lang.Math.*;
public class tpe {
    enum Size {SMALL,LARGE};//枚举类型
    public static void main(String[] args) {
        System.out.println((byte)300);//\u00A0 is a newline

        Size s = Size.LARGE;
        System.out.println(s);

        String all = String.join("/","s","M");
        System.out.println(all);
        boolean c = "hello".equals("heoll");
        System.out.println(c);
        String greeting = "   Hel  lo";
        int index = greeting.offsetByCodePoints(0,1);
        System.out.println(index);
        int st = greeting.compareTo("Hello");
        System.out.println(st);
        int sr = greeting.lastIndexOf('l');
        System.out.println(sr);
        String t=greeting.substring(0,3);
        System.out.println(t);
        String ut = greeting.trim();
        System.out.println(ut.length());
        String g  = String.join("/","1","2");
        System.out.println(g);

    }
}
