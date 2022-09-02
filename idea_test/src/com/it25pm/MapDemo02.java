package com.it25pm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//Map集合的遍历
public class MapDemo02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("it01","abc");
        map.put("it02","cdb");
        map.put("it03","cgr");
        map.put("it03","刘艳");
        Set<String> keyset = map.keySet();
        for(String s:keyset){
            String value = map.get(s);
            System.out.println(s+","+value);
        }
    }
}
