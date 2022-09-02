package com.set;

public class HashDemo {
    public static void main(String[] args) {
//       创建学生对象
        Student s1 = new Student("abc",30);
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        Student s2 = new Student("abc",30);
        System.out.println(s2.hashCode());
        System.out.println("-------");
        System.out.println("hello".hashCode());
        System.out.println("world".hashCode());
        System.out.println("java".hashCode());
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());//string重写了hashcode方法
    }
}
