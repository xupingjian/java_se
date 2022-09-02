package com.it25em.collection;

import java.util.*;

/*Arraylist的构造方法*/
public class Test7 {
    public static void main(String[] args) {
//        默认初始化容量
        List<Object> o1 = new ArrayList<>();
//        指定初始化容量100
        List<Object> o2 = new ArrayList<>(100);
//        在构造方法中传入一个集合对象
        Collection c = new HashSet();
        c.add(100);
        c.add(200);
        c.add("aa");
        Iterator iterator = c.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        通过这个构造方法可以将HashSet集合转为List集合
        List<Object> o3 = new ArrayList<>(c);
        for (int i = 0; i < o3.size(); i++) {
            System.out.println(o3.get(i));
        }
    }
}
