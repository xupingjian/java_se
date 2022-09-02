package com.it315pm;

import java.util.ArrayList;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> li = new ArrayList<>();
        li.add("liqingxia");
        li.add("zhangmanyu");
        li.add("wangzuxian");
        li.add("liuyan");
        li.add("zhangmin");
        li.add("zhangwuji");
        //按照字符串长度把数据在控制台输出
        li.stream().sorted((s1,s2)->{
            int num = s1.length()-s2.length();//这里为什么是升序排列？
            int num2 = num == 0 ? s1.compareTo(s2) : num;
            return num2;
        }).forEach(System.out::println);
    }
}
