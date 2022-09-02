package com.it25am;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) {
        //创建一个集合对象
        //collection完全抽象，无法实例化
        Collection<Object> objects = new ArrayList<>();
        objects.add(120);//自动装箱,实际上是放进去一个对象的内存地址 Integer i = new Integer(120)
        objects.add(new Object());
        objects.add(new Student());
        objects.add("hah");
        System.out.println(objects.size());
        boolean contains = objects.contains(120);
        System.out.println(contains);
//        objects.remove("hah");
        System.out.println(objects.size());
        boolean empty = objects.isEmpty();
        System.out.println(empty);
        Object[] objects1 = objects.toArray();//集合对象转换为数组
        for (int i = 0; i < objects1.length; i++) {
            Object o = objects1[i];
            System.out.println(o);
        }
    }
}
class Student{}
