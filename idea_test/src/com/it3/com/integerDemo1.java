package com.it3.com;

public class integerDemo1 {
    public static void main(String[] args) {
//        int->String
        int number = 100;
        String s1 = ""+number;
        System.out.println(s1);

        String s2 = String.valueOf(number);
        System.out.println(s2);
//        String->int
        String s = "100";
        Integer i = Integer.valueOf(s);
        int x =i.intValue();
        System.out.println(x);
        int y = Integer.parseInt(s);
        System.out.println(y);

    }
}
