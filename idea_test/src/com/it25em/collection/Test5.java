package com.it25em.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test5 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("abc");
        c1.add("def");
        c1.add("syx");
        Iterator it = c1.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            it.remove();
            //c1.remove()这里不能有集合对象remove方法删
//            在迭代元素的过程中，一定要使用迭代器Iterator的remove方法，删除元素，不要使用集合自带的方法删除元素
            System.out.println(next);
        }
        System.out.println(c1.size());
    }
}
