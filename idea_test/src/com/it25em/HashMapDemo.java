package com.it25em;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Student> hm = new HashMap<>();
        Student s1 = new Student("abc",30);
        Student s2 = new Student("dfc",35);
        Student s3 = new Student("agdfgh",34);
        hm.put("it01",s1);
        hm.put("it02",s2);
        hm.put("ie03",s3);
        //方法1：键找值
        Set<String> keySet = hm.keySet();
        for(String key:keySet){
            Student s = hm.get(key);
            System.out.println(key+","+s.getName()+s.getAge());
            System.out.println("------");


        }
        //方法2 键值对对象找键和值
        Set<Map.Entry<String, Student>> entrySet = hm.entrySet();
        for(Map.Entry<String,Student> me:entrySet){
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key +','+value.getName()+","+value.getAge());
        }
    }
}
