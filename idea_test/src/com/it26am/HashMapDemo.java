package com.it26am;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i = 0;i<line.length();i++){
            char key = line.charAt(i);
            Integer value = hm.get(key);
            if(value ==null){
                hm.put(key,1);
            }else{
                value++;
                hm.put(key,value);
            }


        }
        StringBuilder sb = new StringBuilder();
        Set<Character> keySet = hm.keySet();
        for(Character key:keySet){
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }
        String re = sb.toString();
        System.out.println(re);


    }
}
