package com.it32pm;

import java.util.Properties;
import java.util.Set;

/*Properties作为Map集合的使用*/
public class PropertiesDemo01 {
    public static void main(String[] args) {
        //创建集合对象
//        Properties<String,String> prop = new properties<String,String>();//错误
        Properties prop = new Properties();
        //存储元素
        prop.put("itheiwf","csdgge");
        prop.put("许平健","fsge");
        prop.put("vdfbge","bqgeb");

        //遍历集合
        Set<Object> keySet = prop.keySet();
        for(Object key:keySet){
            Object value = prop.get(key);
            System.out.println(key+","+value);
        }
    }
}
