package com.it1;
/*
* 接口：1 街口也是一种“引用数据类型”。编译之后也是一个class字节码文件
* 2 接口是完全抽象的（抽象类是半抽象）
* 3.借口语法【修饰符列表】 interface 接口名{}
* 4 接口支持多继承，一个接口可以继承多个接口
* 5 接口中只包含两部分内容，一部分是常量一部分是抽象方法，接口中只有这两部分
* 6 类和接口之间叫做实现,实现使用implements关键字完成
* 7 当一个非抽象的类实现接口的话，必须将接口中所有的抽象方法全部实现 */
public class Test17 {
    public static void main(String[] args) {
        System.out.println(C.PI);
    }
}
interface D{}
interface E{}
interface C extends D,E{
    public static final double PI = 3.14;//public static final可省略
    public abstract int sum(int a,int b);//public abstract可省

    }

