package com.it25;

public class Test10 {
    public static void main(String[] args) {
        String[] s = "name=fasf&=vfsv&age=age".split("=");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
