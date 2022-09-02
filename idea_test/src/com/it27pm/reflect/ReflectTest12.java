package com.it27pm.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*通过反射机制调用构造方法实例化java对象*/
public class ReflectTest12 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        //一般方法调用构造方法\
//        Vip vip = new Vip();
//        Vip vip1 = new Vip(12, "jack", "1990_10", "man");
        //使用反射机制创建对象
        Class c = Class.forName("com.it27pm.reflect.Vip");
        Object o = c.newInstance();//调用无参构造方法
        //1.获取到这个有参的构造方法
        Constructor constructor = c.getConstructor(int.class, String.class, String.class, boolean.class);
        //2.调用构造方法new对象
        Object vip = constructor.newInstance(12, "jack", "1990_10", true);
        System.out.println(vip);
    }


}
