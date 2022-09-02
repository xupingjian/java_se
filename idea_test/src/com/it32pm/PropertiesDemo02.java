package com.it32pm;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo02 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("itheima001","许平健");
        prop.setProperty("ithrdv002","黄宇");

//        System.out.println(prop.getProperty("ithrdv002"));//根据键得键值//返回类型是字符串
        Set<String> names = prop.stringPropertyNames();//返回键集合
        for(String key:names){
            System.out.println(key);
        }
    }
}
