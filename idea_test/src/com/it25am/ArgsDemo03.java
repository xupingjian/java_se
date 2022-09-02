package com.it25am;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ArgsDemo03 {
    public static void main(String[] args) {
        //aslist返回由指定数组支持的固定大小的列表
//        List<String> list = Arrays.asList("hello","world","java");
//        list.add("java");//UnsupportedOperationException 和list.remove都不支持，但list.set支持
        List<String> list = List.of("Hello", "Hello", "fsdge");//List.of()返回包含任意数量元素的不可变列表，增删改都不支持，可重复
        Set<String> st = Set.of("Hello", "jqava ", "sgfgt");//Set.of()返回包含任意数量元素的不可变集合，增删改都不支持，不可重复
        System.out.println(st);
        System.out.println(list);


    }
}
