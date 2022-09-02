package com.it22;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
//        ListIterator<String> lit = list.listIterator();

     /*   while(lit.hasNext()){
            String s = lit.next();
            System.out.println(s);
        }*/
      /*  while(lit.hasPrevious()){
            String s =lit.previous();
            System.out.println(s);*/
        ListIterator<String> lit =list.listIterator();
        while(lit.hasNext()){
            String s = lit.next();
            if(s.equals("world")){
                lit.add("javaee");//这里不会出现并发修改异常，因为这里的add方法每修改一次就把实际值赋给预期修改值，不同于前面的

            }

        }
        System.out.println(list);


        }
    }

