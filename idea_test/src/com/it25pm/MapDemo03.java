package com.it25pm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo03 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("it01","abc");
        map.put("it02","cdb");
        map.put("it03","cgr");
        //获取所有键值对对象的集合
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        //遍历键值对对象的集合，得到每一个键值对对象
        for(Map.Entry<String, String> me:entrySet){
            //根据键值对对象获取键和值
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+","+value);

        }

    }
}
