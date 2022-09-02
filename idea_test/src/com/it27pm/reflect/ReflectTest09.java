package com.it27pm.reflect;

import com.it22.Student;

import java.lang.reflect.Field;

public class ReflectTest09 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
//        new一个对象设置并访问一个对象不灵活
/*        student s = new student();
        s.no = 13;
        System.out.println(s.no);*/
        /*通过反射机制访问对象属性，这种方式比较灵活，因为可以把参数放到配置文件中*/
        Class c = Class.forName("com.it27pm.reflect.student");
        Object o = c.newInstance();//实例化获得student对象
        //获取no属性（根据属性的名称来获取Field）
        Field no = c.getDeclaredField("no");
        /*给o对象（student）的no属性赋值，虽然使用了反射机制，但是三要素还是缺一不可，o对象，no属性，属性值*/
        no.set(o,1111);
        no.get(o);
        System.out.println(no.get(o));
        //访问私有属性name(与公共的属性访问不同)
        Field names = c.getDeclaredField("name");
//      打破封装（）这样就可以利用反射访问私有属性了
        names.setAccessible(true);
        names.set(o,"xpj");
        System.out.println(names.get(o));
    }
}
