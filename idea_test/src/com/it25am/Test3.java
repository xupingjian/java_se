package com.it25am;

public class Test3 {
    public static void main(String[] args) {
        MyException it = new MyException("我的异常");
        String message = it.getMessage();
        System.out.println(message);
        it.printStackTrace();

    }
}
