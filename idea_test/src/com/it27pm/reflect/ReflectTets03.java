package com.it27pm.reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

/*验证反射机制的灵活性：java代码写一遍，不改变源码的基础上，可以做到不同对象的实例化(只需要修改属性配置文件里的键值)，很灵活（符合OCP开闭原则：对扩展开放，对修改关闭）*/
public class ReflectTets03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        //通过IO流读取classinfo.properties文件
        FileReader reader = new FileReader("idea_test\\src\\com\\it27pm\\reflect\\classinfo.properties");
        //创建属性类对象Map
        Properties p = new Properties();
        p.load(reader);
        reader.close();
        String className = p.getProperty("className");
        System.out.println(className);
        //通过反射机制实例化对象（相比较new某一个具体的类对象来说，反射机制更灵活）
        //User user = new User();这种就写死了
        Class c = Class.forName(className);
        Object o = c.newInstance();
        System.out.println(o);

    }
}
