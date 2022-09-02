package com.it27pm.reflect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pvf{
    public static void main(String[] argv){
        List<Integer> a = Arrays.asList(1,2);
        a.add(2);
        a.add(4);
        a.add(5);
        a.add(3);
        a.add(1);
        a.add(1,9);
        System.out.println(a);


    }
}