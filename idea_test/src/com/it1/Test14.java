package com.it1;

public class Test14 {
    public static void main(String[] args){
        User u = new User(1);
//        u.age  = 12;
        System.out.println(u.age);
    }
}
final class User{
    final int age;/*final关键字：1 final修饰的类无法继承 2 final修饰的方法无法覆盖 3 final修饰的变量只能
    赋一次值 4 final修饰的引用一旦指向某个对象，则不能重新指向其它对象，但该引用指向的对象内部的数据是可以修改的
    5 final 修饰的实例变量一般和static联合使用，称为常量*/

    public User(int age) {
        this.age = age;
    }
}
//class C extends User{}