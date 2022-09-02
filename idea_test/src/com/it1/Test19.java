package com.it1;

public class Test19 {
    public static void main(String[] args) {
        Animall a = new cats();
        a.eat();
        Flayable f = new cats();
        f.fly();
    }
}
class Animall {
    public void eat(){
        System.out.println("动物可以吃");
    }
}
interface Flayable{
    void fly();
}
class cats extends Animall implements Flayable{
    public void fly(){
        System.out.println("猫可以飞");
    }
}