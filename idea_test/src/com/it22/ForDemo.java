package com.it22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForDemo {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        for(int i:arr){
            System.out.println(i);
        }
       /* String[] str = {"hello","world","java"};
        for(String s :str){
            System.out.println(s);
        }
*/
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");
        /*for(String s:list){
            System.out.println(s);
        }*/
        Iterator<String> it = list.iterator();


        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
