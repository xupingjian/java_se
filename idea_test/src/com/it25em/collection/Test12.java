package com.it25em.collection;

import java.util.*;

public class Test12  {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<Integer, String> map = new TreeMap<>();
        //向MAp集合添加键值对
        map.put(1,"zhangsan");//在这里1自动装箱成Integer类型
        map.put(2,"lisi");
        map.put(3,"zhaoliu");
        map.put(4,"afs");
        //通过key或获得value
        String s = map.get(2);
        System.out.println(s);
        //获取键值对的数量
        System.out.println("键值对数量："+map.size());
        //通过key删除key-value
        map.remove(4);
        System.out.println("键值对数量："+map.size());
        System.out.println(map.containsKey(4));//判断是否包含某个key
        System.out.println(map.containsValue("lisi"));//判断是否包含某个value
        System.out.println(map.isEmpty());
        Collection<String> values = map.values();
        System.out.println(values);

        //map集合的遍历
        //第一种方式.获取所有的key,通过遍历key,来遍历value
        Set<Integer> keys = map.keySet();
        //foreach
        for (Integer i:keys
             ) {
            System.out.println(map.get(i));
        }
        System.out.println("============");
        //迭代器
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()){
            Integer key = it.next();
            System.out.println(key+"="+map.get(key));
        }
        System.out.println("-----------");
        //第二种方式：Set<Map.Entry<K,V>> entrySet()
        //把Map集合直接全部转换成Set集合,Set集合中的元素类型是：Map.Entry
        //迭代器
        Set<Map.Entry<Integer, String>> set = map.entrySet();

        Iterator<Map.Entry<Integer, String>> it1 = set.iterator();//遍历Set集合，每一次取出一个Node
        while (it1.hasNext()){
            Map.Entry<Integer, String> next = it1.next();
            System.out.println(next.getKey()+"="+next.getValue());
        }
        System.out.println("======");
        //foreach
        for (Map.Entry<Integer,String>  node: set
             ) {
            System.out.println(node.getKey()+"="+node.getValue());

        }
    }
}
