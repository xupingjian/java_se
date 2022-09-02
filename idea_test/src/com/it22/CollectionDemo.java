package com.it22;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> c =new ArrayList<String>();
        c.add("hello");
        c.add("world");
        c.add("java");
//        c.remove("world");
//        c.clear();
        System.out.println(c.size());


    }
}
