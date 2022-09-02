package com.it1;

public class Test13 {
    public static void main(String[] args) {
        Vip v =new Vip("张三");
        v.shopping();
    }
}
class Customer{
    String name;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }
}
class Vip extends Customer{
    //假设子类也有一个同名属性
    String name;//实例变量
    int age;

    public Vip(){
    }
    public Vip(String name){
        super(name);
//        this.name=null;
    }
    public void shopping(){
        System.out.println(this.name +"正在购物");
        System.out.println(super.name+"正在购物");
        System.out.println(name +"正在购物");
    }
}
