package com.it25em.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* list有序可重复，还有下标
* list与collection相比特有的方法
* void add(int index，E element)
* E get(int index)
* int indexof(Object o)第一次出现的索引
* int lastIndexof(object o)最后一次出现的索引
* E remove(int index)
* E set(int index,E element)修改某处的下标的元素 */
public class Test6 {
    public static void main(String[] args) {
        List<Object> mylist = new ArrayList<>();
        mylist.add("A");
        mylist.add("B");
        mylist.add("C");
        mylist.add("D");

        mylist.add(1,"king");
        mylist.add(3,"king");
        Object o = mylist.get(1);
        System.out.println(o);
//        Iterator<Object> iterator = mylist.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        //换一种迭代
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }
        int kingIndex = mylist.lastIndexOf("king");
        System.out.println(kingIndex);
        int king = mylist.indexOf("king");
        System.out.println(king);
        //删除指定下标的元素remove（int index）
    }
}
