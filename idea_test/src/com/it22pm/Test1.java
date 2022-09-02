package com.it22pm;

public class Test1 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();

        Animal[] animals = {a1,a2};
/*        for (int i = 0; i < animals.length; i++) {
            animals[i].move(i);

        }*/

        animals[1]  = new Cat();//可以在一个数组对象里存子类和父类，但不可以在一个的数组里存两个没有关系的类
//        animals[2] = new Cat();
//        animals[1].move(1);
//        Animal[] animalss = {a1,a2};
        for (int i = 0; i < animals.length; i++) {
            Animal animalss1 = animals[i];
            animalss1.move(i);

        }

    }
}
class Animal{
    public void move(int s){
        System.out.println("Animal move"+ s);
    }
}
class Product{}
class Cat extends Animal{
    @Override
    public void move(int s) {
        System.out.println("猫在跑不赢");
    }
}