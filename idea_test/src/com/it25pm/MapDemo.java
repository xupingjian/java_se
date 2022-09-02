package com.it25pm;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<String,String>();
        //V put(K key,V value)将指定的值与该映射中的指定键相关联,当同一个键出现两次，后一个键值会覆盖前一个
        map.put("it01","abc");
        map.put("it02","cdb");
        map.put("it03","cgr");
        map.put("it03","刘艳");
//        System.out.println(map.containsValue("刘艳"));
        System.out.println(map);
    }
}
