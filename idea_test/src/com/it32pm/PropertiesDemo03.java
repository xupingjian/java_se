package com.it32pm;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
//properties与io流结合
public class PropertiesDemo03 {
    public static void main(String[] args) throws IOException {
//        myStore();
        myLoad();
    }
//把文件中的数据加载到集合
    private static void myLoad() throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("idea_test\\\\osw2.txt");
        prop.load(fr);
        fr.close();
        System.out.println(prop);
    }
//把集合中的数据保存到文件
    private static void myStore() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("itheima001","acbc");
        prop.setProperty("itheima002","ghmng");
        prop.setProperty("itheima003","vsvv");

        FileWriter fw = new FileWriter("idea_test\\\\osw2.txt");
        prop.store(fw,null);
        fw.close();

    }

}
