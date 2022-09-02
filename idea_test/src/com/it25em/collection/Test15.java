package com.it25em.collection;

import java.util.Properties;

/*Properties是一个Map集合，继承Hashtable,Properties的key和value都是String类型
* Properties被称为属性类对象（线程安全的）*/
public class Test15 {
    public static void main(String[] args) {
        //创建一个Propert对象
        Properties pro = new Properties();
        //Properties的存和取
        pro.setProperty("wetr","gfsdfg");
        pro.setProperty("fwe","fwq");
        pro.setProperty("fws","sfgvsa");
//取
        String s1 = pro.getProperty("wetr");
        System.out.println(s1);

    }
}
