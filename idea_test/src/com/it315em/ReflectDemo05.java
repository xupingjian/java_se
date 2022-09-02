package com.it315em;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*通过反射实现如下操作
*      Student s = new Student();
*       s.method1();
*       s.method2("林青霞");
*       String ss =s.method3("林青霞",30);
*       sout(ss);
*       s.function();*/
public class ReflectDemo05 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c = Class.forName("com.it315em.Student");

        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        //s.method1();
        Method m = c.getMethod("method1");
        m.invoke(obj);
        //s.method2("林青霞");
        Method m2 = c.getMethod("method2",String.class);
        m2.invoke(obj,"许平健");
        //String ss =s.method3("林青霞",30);
        Method m3 = c.getMethod("method3", String.class, int.class);
        Object value = m3.invoke(obj, "许平健", 24);
        System.out.println(value);
        //s.function()
//        Method m4 = c.getMethod("function");//function是私有的方法

        Method m4 = c.getDeclaredMethod("function");
        m4.setAccessible(true);
        m4.invoke(obj);

    }
}
