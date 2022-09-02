package com.it1;

public class  PetTest {
    public static void main(String[] args) {
        Animal a = new Cat();//向上转型，子（猫）指向父(动物）,多态：父类型引用指向子类型对象
        a.move();

//        Animal a = new Cat();
//        a.catchmouse();  编译就会发生错误，编译看左边，a是一个animal,没有猫的特有方法，抓老鼠，
//        故只能用向下转型调用猫的特有方法
        Animal c = new Cat();
        Cat x = (Cat) c;
        x.Catchmouse();

        //但是向下转型存在风险(编译通过，运行时出错，运行阶段，堆内存实际创建的对象是：Brid对象，拿着Brid找cat不行，因为这两之间没有继承关系）
//        Exception in thread "main" java.lang.ClassCastException
        Animal c1 = new Brid();
//        Cat x1 = (Cat) c1;
//        x1.Catchmouse();
//利用instanceof解决这种问题，instanceof在运行阶段动态判断引用指向的对象的类型,语法： 引用 instanceof 类型)
        if (c1 instanceof Cat){
            Cat x1 = (Cat) c1;
            x1.Catchmouse();
        }

    }
}
