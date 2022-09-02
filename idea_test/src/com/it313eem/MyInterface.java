package com.it313eem;

public interface MyInterface {
    void show1();
    void show2();
    //接口里的默认方法是实现类不需要重写的
    public default void show3(){
        System.out.println("show3");
    }
}
