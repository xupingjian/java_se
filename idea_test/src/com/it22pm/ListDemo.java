package com.it22pm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");

        for(String s:array){
            System.out.println(s);
        }

        for(int i = 0;i< array.size();i++){
            String s = array.get(i);
            System.out.println(s);
        }
        Iterator<String> it = array.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        LinkedList<String> link = new LinkedList<>();
        link.add("hello");
        link.add("world");
        link.add("java");

        for(String s:link){
            System.out.println(s);
        }
    }
}
