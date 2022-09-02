package com.it25;

public class Test05 {
    public static void main(String[] args) {
        int re = "abc".compareTo("abc");
        System.out.println(re);
        int re1 = "abc".compareTo("abe");//前小后大
        System.out.println(re1);
        int re2 = "abe".compareTo("abc");//前大后小(一直比，直到比到有区分的时候)
        System.out.println(re2);
    }
}
