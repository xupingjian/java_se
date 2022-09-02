package com.it25em.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test9 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("http://www.hello.com");
        c.add("http://www.baidu.com");

        Iterator<String> it = c.iterator();
        while(it.hasNext()){
            String ne = it.next();//在这里利用泛型机制让返回的是String而不是Object，故后面能直接使用字符串的substring方法
            String substring = ne.substring(7);
            System.out.println(substring);
        }
    }
}

