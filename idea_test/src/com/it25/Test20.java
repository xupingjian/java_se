package com.it25;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Test20 {
    public static void main(String[] args) {
        Random random = new Random();
        TreeSet<Object> objects = new TreeSet<>();
        for (int i = 0; i < 100; i++) {
            int j = random.nextInt(6);
            objects.add(j);
            if(objects.size()==5){
                Iterator<Object> iter = objects.iterator();
                while( iter.hasNext()){
                    Object next = iter.next();
                    System.out.println(next);
                }
                return;
            }
        }


    }
}
