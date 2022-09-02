package com.it27pm.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectTest07 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c = Class.forName("com.it27pm.reflect.student");
        String name1 = c.getName();
        System.out.println("完整类名："+name1);
        String simpleName = c.getSimpleName();
        System.out.println("简名："+simpleName);
        //获取类中所有的public修饰的Field
        Field[] fields = c.getFields();
        int length = fields.length;
        System.out.println(length);
        //取出这个Field
        Field f = fields[0];
        //取出这个Field它的名字
        String name = f.getName();
        System.out.println(name);

        //获取所有的Filed
        Field[] declaredFields = c.getDeclaredFields();
        System.out.println(declaredFields.length);

        System.out.println("------");
        for(Field field:declaredFields){
            //获取属性的类型
            System.out.println(field.getType());
            //获取属性的名字
            System.out.println(field.getName());
            //获取属性修饰符
            int i = field.getModifiers();
            String s = Modifier.toString(i);


            System.out.println("修饰符"+s);
        }

    }
}
