package com.it2;

public class Test {
    public static void main(String[] args) {
        //" is a "表示继承，“ has a ”表示具有的属性
        Master m = new Master();
        Dog d = new Dog();
        m.feed(d);
        Cat c = new Cat();
        m.feed(c);
        Pet p= new She();
        m.feed(p);
    }
}
