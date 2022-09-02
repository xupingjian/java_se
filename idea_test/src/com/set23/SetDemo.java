package com.set23;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer > set = new HashSet<>();
//        或者创建Treeset集合 Set<Integer> set = new TreeSet<Integer>();
        Random r = new Random();

        while(set.size()<10){
            int i = r.nextInt(20) + 1;
            set.add(i);
        }
        for(Integer i :set){
            System.out.println(i);
        }
    }
}
