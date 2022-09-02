package com.it22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");
//        遍历集合，得到每一个元素，看有没有“world”这个元素，如果有，就添加一个”javaee"元素
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            if(s.equals("world")){
                list.add("javaee");
            }
        }
    }
}
