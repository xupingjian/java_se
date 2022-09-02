package com.it25;

public class Test04 {
    public static void main(String[] args) {
        byte[] bytes= {97,98,99};
        String s = new String(bytes);
        System.out.println(s.toString());
        char[] chars = {'我','h','?'};
        String s1 = new String(chars);
        System.out.println(s1);
        String s2 = String.valueOf('a');
        System.out.println(s2);


    }
}
