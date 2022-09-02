package com.it25em.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Test2 {
    public static void main(String[] args) {
        Collection<Object> c = new HashSet<>();
        c.add("abc");
        c.add("def");
        c.add(100);
        c.add(200);
        c.add(600);
        c.add(800);
        c.add(900);
        c.add(200);
        c.add(400);
        c.add(20);

        c.add(new Object());
        //迭代：1 获取集合对象的迭代器对象Iterator
        Iterator<Object> it = c.iterator();
        // 2 通过迭代器随想开始迭代
        while(it.hasNext()){
            System.out.println(it.next());//HashSet不可重复，且无序。如果换成Arraylist则可重复，且有序
        }
    }
}
