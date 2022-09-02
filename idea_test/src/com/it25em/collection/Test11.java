package com.it25em.collection;

import java.util.Collection;
import java.util.TreeSet;

public class Test11 {
    public static void main(String[] args) {
        Collection<String> o = new TreeSet<>();
//treeset无序不可重复，但存储的元素课自动安装大小顺序排序
        o.add("A");
        o.add("B");
        o.add("Z");
        o.add("Z");
        o.add("Y");
        o.add("X");
        o.add("C");
        for (String s : o
                ) {
            System.out.println(s);
        }
    }
}
