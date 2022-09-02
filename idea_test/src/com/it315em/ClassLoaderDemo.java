package com.it315em;

public class ClassLoaderDemo {
    public static void main(String[] args) {
        ClassLoader c = ClassLoader.getSystemClassLoader();
        System.out.println(c);//AppClassLoader返回用于委派的系统类加载器

        ClassLoader c2 = c.getParent();//PlatformClassLoader返回父类加载器进行委派，这里的父类是平台加载器
        System.out.println(c2);

        ClassLoader c3 = c2.getParent();
        System.out.println(c3);//null
    }
}
