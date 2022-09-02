package com.it313eem;

public interface Inter {
    default void show1(){
        System.out.println("show1开始执行");
        method();
//        System.out.println("初级工程师");
//        System.out.println("中级工程师");
//        System.out.println("高级工程师");
        System.out.println("show1结束执行");
    }
    default void show2(){
        System.out.println("show2开始执行");
        method();//在默认方法里既可以调用一般方法也可以调用静态方法
//        System.out.println("初级工程师");
//        System.out.println("中级工程师");
//        System.out.println("高级工程师");
        System.out.println("show2结束执行");
    }
    static void method1(){
        System.out.println("method1开始执行");
        method();
//        System.out.println("初级工程师");
//        System.out.println("中级工程师");
//        System.out.println("高级工程师");
        System.out.println("method1结束执行");
    }
    static void method2(){
        System.out.println("method2开始执行");
        method();//在静态方法里只能调用静态方法
//        System.out.println("初级工程师");
//        System.out.println("中级工程师");
//        System.out.println("高级工程师");
        System.out.println("method2结束执行");
    }


    private static void method(){
        System.out.println("初级工程师");
        System.out.println("中级工程师");
        System.out.println("高级工程师");
    }
}
