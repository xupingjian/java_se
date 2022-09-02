package com.it25pm;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("it01","abc");
        map.put("it02","cdb");
        map.put("it03","cgr");
        map.put("it03","刘艳");
//        System.out.println(map.get("it03"));
        Set<String> keySet = map.keySet();//keySet获取所有键的集合
        for(String s:keySet){
            System.out.println(s);
        }
        Collection<String> values = map.values();
        for(String k:values){
            System.out.println(k);
        }


    }

}
