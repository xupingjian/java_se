package com.it27pm.reflect;
/*获取到class,能干什么
* 通过Class的newInstance()方法实例化对象
* 注意：newInstance()方法内部实际调用了无参构造方法，必须保证无参构造存在才可以（没有会使用默认无参）*/
public class ReflectTest02 {
    public static void main(String[] args) {
        //不使用反射机制创建对象
        User user = new User();
        System.out.println(user);
        //运用反射机制创建对象
        try {
            Class c = Class.forName("com.it27pm.reflect.User");
            Object o = c.newInstance();
            System.out.println(o);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
