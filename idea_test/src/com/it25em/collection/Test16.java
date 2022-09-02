package com.it25em.collection;

import java.util.TreeSet;

/*TreeSet集合底层实际上是一个TreeMap，而TreeMap集合底层是一个二叉树。
无序不可重复，但是可以按照元素的大小顺序自动排序，称为可排序集合，在需要的场景可以用treeset
* */
public class Test16 {
    public static void main(String[] args) {
        TreeSet<String> o1 = new TreeSet<>();
        o1.add("zhangsan");
        o1.add("zhangan");
        o1.add("lisi");
        o1.add("waqngwu");
        for (Object o:o1
             ) {
            System.out.println(o);
        }
    }
}
