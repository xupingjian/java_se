package com.it1;

public class test9 extends mouse{

    public test9() {
        super();
    }

    public static void main(String[] args) {
        mouse m = new test9();
        m.qwer();

    }
}

class mouse{
    private int sc=0;
    private double str;
    public void qwer(){
        System.out.println("我是憨憨");
    }
}