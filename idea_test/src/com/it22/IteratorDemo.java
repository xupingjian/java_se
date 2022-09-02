package com.it22;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("Hello");
        c.add("world");
        c.add("java");
//        Interator<E> iterator():返回此集合中元素的迭代器，通过集合的Iterator（）方法得到
        Iterator<String> it = c.iterator();//多态的方式创建Interator对象
        /*    public Iterator<E> iterator() {
                return new Itr();
    }


              private class Itr implements Iterator<E> {...}*/
        while(it.hasNext()){
            String s =it.next();
            System.out.println(s);

        }
    }
}
