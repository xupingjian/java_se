package com.it25;

public class Test18 {
    public static void main(String[] args) {
        //String -> int
        String s1 = "100";
        int i = Integer.parseInt(s1);
        System.out.println(s1);
        //int -->String
        String s2 = 100 + "";
        System.out.println(s2);
        String s3 = String.valueOf(100);
        System.out.println(s3);
        //int --> Integer
        Integer integer = Integer.valueOf(100);
        System.out.println(integer);
        //String-->Interger
        Integer integer1 = Integer.valueOf("123");
        //Integer -->String
        String s = String.valueOf(integer1);
        System.out.println(s);
        //Integer-->int
        int k = integer;
        System.out.println(i);

    }
}
