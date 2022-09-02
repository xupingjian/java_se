package com.it25em.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*1.HashMap集合底层是哈希表/散列表的数据结构
2.哈希表是数组和单向链表的结合体
4.主要掌握：map.put(K,V)和 v= map.get(K)
5.HashMap集合的key特点：无序，不可重复。放在HashMap集合的key元素其实就是放到HashSet集合中，所以HashMap集合中的元素也需要重写hashCode()+equals()方法
6.哈希表HashMap，假设将所有的hashCode()方法返回值固定为一个值，会导致底层哈希表变成纯单向链表，这种情况称为散列分布不均匀
* 7.重点：放在HashMap集合key部分的元素，以及放在HashSet集合中的元素，需要同时重写hashcode和equals方法*/
public class Test13 {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<Integer, String> map = new HashMap<>();
        //向MAp集合添加键值对
        map.put(1,"zhangsan");//在这里1自动装箱成Integer类型
        map.put(2,"lisi");
        map.put(22,"nihao");
        map.put(3,"zhaoliu");
        System.out.println(map.size());
        //遍历Map集合
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry<Integer, String> entry: set
             ) {
            //
            System.out.println(entry.getKey()+"="+entry.getValue());

        }

    }
}

