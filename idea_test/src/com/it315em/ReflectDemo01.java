package com.it315em;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//反射获取构造方法并使用
public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c = Class.forName("com.it315em.Student");
        //通过对象获取构造方法
//        Constructor<?>[] cons = c.getConstructors();//getConstructors()返回公共的构造方法数组
        Constructor<?>[] cons = c.getDeclaredConstructors();//getDeclaredConstructors()返回所有的构造方法数组
        for(Constructor con:cons){
            System.out.println(con);
        }
        System.out.println("------");

//        Student s =new Student();
//        System.out.println(s);
        //通过反射创造对象（通过构造方法对象里的方法来创建对象）
        Constructor<?> con = c.getConstructor();
        //Constructor提供了一个类的单个构造函数的信息和访问权限
        Object obj = con.newInstance();//创建对象
        System.out.println(obj);
    }
}
