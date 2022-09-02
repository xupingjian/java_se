package com.it314am;

public class InterDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        i.show();
        i.method();
//        i.test();不可以通过接口的实现类来调用接口的静态方法
        Inter.test();
    }
}

