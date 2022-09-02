package com.it25em;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();
        Student s1 = new Student("abc", 30);
        Student s2 = new Student("dfc", 35);
        Student s3 = new Student("agdfgh", 34);
        Student s4 = new Student("agdfgh", 34);
        hm.put(s1, "西安");
        hm.put(s2, "武汉");
        hm.put(s3, "郑州");
        hm.put(s4, "北京");
        //方法1：键找值
        Set<Student> keySet = hm.keySet();
        for (Student key : keySet) {
            String s = hm.get(key);
            System.out.println(key.getName() + "," + key.getAge() + s);
            System.out.println("------");


        }

    }
}
