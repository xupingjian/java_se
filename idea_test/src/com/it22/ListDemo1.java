package com.it22;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("world");
        list.add("java");
//        list.remove(0);
/*        System.out.println(list.set(2,"python"));
        System.out.println(list);*/
        for(int i = 0;i<list.size();i++){
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
