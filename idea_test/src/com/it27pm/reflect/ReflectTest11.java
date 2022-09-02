package com.it27pm.reflect;
/*重点：通过反射机制调用一个对象的方法*/
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest11 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        //采用一般方法调用方法
        /*调用方法4要素：1.对象user
        * 2.login方法名
        * 3.实参列表
        * 4.返回值*/
/*        UserService user = new UserService();
        boolean note = user.login("admin", "123");
        System.out.println(note?"登陆成功":"登陆失败");
        */
//        采用反射方法调用方法
        Class c = Class.forName("com.it27pm.reflect.UserService");
        //创建对象
        Object o = c.newInstance();
        //获取Method
        Method method = c.getDeclaredMethod("login", String.class, String.class);
//        调用方法（4要素）.invoke方法很重要，必须记住
        Object admin = method.invoke(o, "admin", "123");
        System.out.println(admin);


    }
}
