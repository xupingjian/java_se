package com.it1;

public class test10 {
    //私有方法不能覆盖
    private  void dosome(){
        System.out.println("私有方法");
    }
    public static void main(String[] args) {
        test10 t = new T();
        t.dosome();
    }
}
class T extends test10{
    private void dosome(){
        System.out.println("T中的dosome方法");
    }
}