package com.it315em;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*Student s=new Student("林青霞“,30,"西安");
        System.out.println(s);
        * */
        //获取Class对象
        Class<?> c = Class.forName("com.it315em.Student");
        //public Student(String name, int age, String address)
        //Constructor<T> getConStructor(Class<?>... parameterTypes)
        //基本数据类型也可以通过.class得到对应的Class类型
        Constructor<?> con = c.getConstructor(String.class, int.class, String.class);
        //通过.newInstance创建对象
        Object obj = con.newInstance("林青霞", 30, "西安");
        System.out.println(obj);
    }
}
