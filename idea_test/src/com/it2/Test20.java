package com.it2;

public class Test20 {
    public static void main(String[] args) {
        //创建厨师对象
        FoodMenu f  =new AmericCooker();
//        FoodMenu f = new ChineseCooker();
        ////面向接口编程，降低程序的耦合度(解开调用者和实现者的耦合)，提高程序的扩展力
        //创建顾客对象
        Customers customers = new Customers(f);

        customers.order();
    }
}

