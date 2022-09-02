package com.it25;

public class Test03 {
    public static void main(String[] args) {
        /*一共三个对象，方法区字符串常量池一个：”hello“
        * 堆内存中有两个String对象
        * 一共三个*/
        String s1 = new String("hello");
        String s2 = new String("hello");
    }
}

