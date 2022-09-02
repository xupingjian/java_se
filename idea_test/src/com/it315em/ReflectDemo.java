package com.it315em;
//3种方式生成class对象
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //使用类的class属性来获取对应的class对象
        Class<Student> c1 = Student.class;
        System.out.println(c1);

        Class<Student> c2 = Student.class;
        System.out.println(c1 == c2);
        System.out.println("--------");
        //调用对象的getClass()方法，返回对象所属类对应的Class对象
        Student s = new Student();
        Class<? extends Student> c3 = s.getClass();
        System.out.println(c1 == c3);
        System.out.println("------");
        //使用Class类中的静态方法forName(String className)
        Class<?> c4 = Class.forName("com.it315em.Student");
        System.out.println(c1==c4);
    }
}
