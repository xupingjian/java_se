package com.it27pm.reflect;

import java.util.Date;

/*要操作一个类的字节码，需要首先获取到这个类的字节码，怎么获取java.lang.Class实例？*/
/*三种方式：1.Class c1 = Class.forName（“完整类名带包名”）
*          2.Class c = 对象.getClass();
*           3.Class c = 任何类型.class*/
public class ReflectTest01 {
    public static void main(String[] args) {
        /*Class.forName()
        * 1.静态方法
        * 2.方法的参数是一个字符串
        * 3.字符串需要的是一个完整类名
        * 4.完整类名必须带有包名，java.lang包名也不能省略*/
        Class c1 = null;
        try {
            c1 = Class.forName("java.lang.String");//c1代表String.class文件，或者说c1代表String类型
            Class c2 = Class.forName("java.util.Date");//c2代表Date类型
            Class c3 = Class.forName("java.lang.Integer");//c3代表Integer类型
            Class c4 = Class.forName("java.lang.System");//c4代表System类型
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //java中任何一个对象都有一个方法：getClass()
        String s = "abc";
        Class s1 = s.getClass();//s代表String.class字节码文件，s代表string类型
        if(s1==c1){
            System.out.println("两个方法得到的字节码文件内存地址相同");
        }

        //第三种，Java中任何一种类型都有.class属性
        Class z = String.class;//z代表String类型
        Class k = Date.class;//k代表Date类型
        Class f = int.class;//f代表int类型
        System.out.println(s1==z);
    }
}
