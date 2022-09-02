package com.it25em.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IncreaseforDemo02 {
    public static void main(String[] args) {
        List<String> strlist = new ArrayList<>();
        strlist.add("hello");
        strlist.add("world");
        strlist.add("af");
        //增强for
        for (String s:strlist
             ) {
            System.out.println(s);
        }
        System.out.println("=================");
        //使用普通for(因为这里用的是ArrayList，是有下标的，如果有set，map是没有普通for的)
        for (int i = 0; i <strlist.size() ; i++) {
            System.out.println(strlist.get(i));
        }
        System.out.println("=================");
        //使用迭代器
        Iterator<String> iterator = strlist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
