package com.it314am;

public class MyStringDemo {
    public static void main(String[] args) {
        useMyString((String s,int x,int y)->{
           return s.substring(2,5);
        });
        //引用类的实例方法
        useMyString(String::substring);
        //lambda表达式被类的实例方法替代的时候
        //第一个参数作为调用者(这里指s)
        //后面的参数全部传递给该方法作为参数（这里指xy)

    }
    private static void useMyString(MyString my){
        String s = my.mySubString("HelloWorld",2,5);
        System.out.println(s);
    }
}
