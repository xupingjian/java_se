package com.it4;

public class Test {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();
        String s = a.getS();
        System.out.println(s);
    }
}
