package com.it315em;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*Student s=new Student("林青霞“);
        System.out.println(s);
        * */
        //获取Class对象
        Class<?> c = Class.forName("com.it315em.Student");
        //private Student(String name, int age, String address)
        //Constructor<T> getDeclaredConStructor(Class<?>... parameterTypes)
        //基本数据类型也可以通过.class得到对应的Class类型
        Constructor<?> con = c.getDeclaredConstructor(String.class);
        //通过.newInstance创建对象
        //这里与Demo02不同的是这里私有构造方法，不能通过私有构造方法创造对象
        //但可以通过暴力反射来解决
        //public void setAccessible(boolean flag):值为true,取消访问检查
        con.setAccessible(true);
        Object obj = con.newInstance("林青霞");
        System.out.println(obj);
    }
}