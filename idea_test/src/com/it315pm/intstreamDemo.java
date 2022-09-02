package com.it315pm;

import java.util.ArrayList;

public class intstreamDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        //将集合中的字符串数据转换为整数之后在控制台输出
//        list.stream().map(s->Integer.parseInt(s)).forEach(System.out::println);
//        list.stream().mapToInt(Integer::parseInt).forEach(System.out::println);
        //int sum()返回此流中的元素总和，intStream中的独有方法,与Stream中的方法不同
        int result = list.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(result);

    }
}
