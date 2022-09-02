package com.it22pm;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList =  new LinkedList<>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");
        linkedList.addFirst("javase");
        System.out.println(linkedList);
    }
}
