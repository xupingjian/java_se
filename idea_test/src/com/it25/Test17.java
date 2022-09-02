package com.it25;

public class Test17 {
    public static void main(String[] args) {
        int i = Integer.parseInt("123");//parseInt将字符串参数作为有符号的十进制整数进行解析。(引用——》基本类型)
        Integer integer = Integer.valueOf(100);//基本类型_-》引用类型
        System.out.println(integer);


        Integer integer1 = new Integer("123");
    }
}
