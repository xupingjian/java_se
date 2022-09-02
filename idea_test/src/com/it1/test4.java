package com.it1;

public class test4 {
    static int i = 100;
    //静态代码块和静态变量在类加载时执行
    static {
        System.out.println("i = "+i);//这里能访问i吗？
    }
    //入口(main方法实际上执行了很多代码)
    public static void main(String[] args) {

    }
}
