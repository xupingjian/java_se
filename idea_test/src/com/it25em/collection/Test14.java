package com.it25em.collection;

import java.util.HashMap;

public class Test14 {
    public static void main(String[] args) {
        HashMap<Object, Object> o = new HashMap<>();
        o.put(null,"100");
        System.out.println(o.get(null));//hashmap的key和value可以为空，但只能一个元素为空（map不可重复性）,但在hashtable里键和值都不能为空
    }
}
