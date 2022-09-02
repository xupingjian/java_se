package com.it25em.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Test3 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        String s1 = new String("abc");
        c.add(s1);
        String s2 = new String("def");
        c.add(s2);
        System.out.println(c.size());
        String x = new String("abc");
        System.out.println(c.contains(x));//判断c中的s1与x是否相同
    }
}
