package com.it315em;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*练习：通过反射实现如下操作
*   Student s =new Student();
*   s.name = "林青霞";
*   s.age = 30;
*   s.address  = "西安";
*   soout(s);*/
public class ReflectDemo04 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> c = Class.forName("com.it315em.Student");
        //Student s =new Student();
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        System.out.println(obj);
        //s.name = "林青霞";
        Field namefiled = c.getDeclaredField("name");
        namefiled.setAccessible(true);
        namefiled.set(obj,"林青霞");
        System.out.println(obj);

        //s.age与s.adress同上
    }
}
