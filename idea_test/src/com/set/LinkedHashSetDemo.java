package com.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet =new LinkedHashSet<>();
        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("java");
        linkedHashSet.add("java");

        for(String s:linkedHashSet){
            System.out.println(s);
        }
    }
}
