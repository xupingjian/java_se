package com.it1;

public class Test11 {
    public static void main(String[] args) {
        new B();
    }
}
class A{
    public A(){
        System.out.println("A类的无参构造方法");
    }
}
class B extends A{
    public B(){
        this("zhangsan");
        System.out.println("B类的无参构造方法");
    }
    public B(String s){
//        super();//无论怎么写，都会执行父类的构造方法，这里不写super也会有super()
        System.out.println("B的s");
    }
}