package com.it27pm.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*通过反射机制，反编译一个类的属性*/
public class ReflectTest8 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("java.lang.String");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Modifier.toString(c.getModifiers())+" ");
        stringBuilder.append("class ");
        stringBuilder.append(c.getSimpleName()+"{"+"\n");
        System.out.println(stringBuilder);
        Field[] f = c.getDeclaredFields();
        for(Field field : f){
            String s = Modifier.toString(field.getModifiers());
            System.out.print("\t"+s+" ");
            String name = field.getType().getSimpleName();
            System.out.print(name+" ");
            String name1 = field.getName();
            System.out.println(name1+";");
        }
        System.out.println("}");
    }
}

