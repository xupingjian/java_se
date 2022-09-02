package com.it27pm.reflect;
/*获取某一个类的父类及其实现的接口*/
public class ReflectTest14 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("java.lang.String");
        //获取String的父亲
        Class superclass = c.getSuperclass();
        System.out.println(superclass.getName());
        //获取String类实现的所有接口
        Class[] interfaces = c.getInterfaces();
        for(Class inter :interfaces){
            System.out.println(inter.getName());
        }
    }
}
