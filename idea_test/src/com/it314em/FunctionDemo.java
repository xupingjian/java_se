package com.it314em;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        convert("100", s -> Integer.parseInt(s));
//        convert("100",Integer::parseInt);//用引用方法替代lambda表达式
        convert(100,s->String.valueOf(s+566));
        convert("100", s -> Integer.parseInt(s),s->String.valueOf(s+566));
    }

    //定义一个方法，把一个字符串转换成Int类型，在控制台输出
    private static void convert(String s, Function<String, Integer> fun) {
        Integer i = fun.apply(s);
        System.out.println(i);
    }
    //定义一个方法，把一个int类型的数据加上一个整数之后，转换字符串在控制台输出
    private static void convert(Integer s, Function<Integer, String> fun) {
        String i = fun.apply(s);
        System.out.println(i);
    }
    //定义一个方法，把字符转换int类型，把int类型的数据加上一个整数之后，转换为字符串在控制台输出
    private static void convert(String s,Function<String,Integer> fun1,Function<Integer,String> fun2){
/*        Integer i = fun1.apply(s);
        String ss = fun2.apply(i);
        System.out.println(ss);*/
        String ss = fun1.andThen(fun2).apply(s);//等同于前3句
        System.out.println(ss);

    }
}
