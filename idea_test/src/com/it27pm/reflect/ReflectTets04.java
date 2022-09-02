package com.it27pm.reflect;
/*如果你只是希望一个类的静态代码块执行，其他代码不执行，你可以使用Class.forName("完整类名")这个方法*/
public class ReflectTets04 {
    public static void main(String[] args) throws ClassNotFoundException {
        //Class.forName()这个方法的指向会导致：类加载
        Class c = Class.forName("com.it27pm.reflect.Myclass");
    }
}
