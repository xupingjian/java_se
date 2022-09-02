package com.it22;

import java.util.ArrayList;
import java.util.Collection;

public class CollecttionDemo01 {
    public static void main(String[] args) {
//        创建Collection集合对象
        Collection<String> c = new ArrayList<String>();

        c.add("hello");
        c.add("world");
        c.add("java");
        System.out.println(c);//没有输出地址，因为重写了toString方法
    }
}
