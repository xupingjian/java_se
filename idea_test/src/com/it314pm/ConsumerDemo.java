package com.it314pm;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        operatorString("xupingjian",(String s)->{
            System.out.println(s);
        });
        operatorString("xupingjian",System.out::println);//方法引用

        operatorString("xupingjian",s->System.out.println(s),s->{
            System.out.println(new StringBuilder(s).reverse().toString());
        });
    }
    //定义一个方法，消费一个字符串数据
    private static void operatorString(String name, Consumer<String> con){
        con.accept(name);
    }
    //定义一个方法，消费一个字符串数据
    private static void operatorString(String name,Consumer<String> con1,Consumer<String> con2){
/*        con1.accept(name);
        con2.accept(name);*/
        con1.andThen(con2).accept(name);//等同于前两句
    }
}
