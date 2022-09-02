package com.it4;

public class Animal {
    protected String s;
    int b = 2;

    public Animal() {
    }

    public Animal(String s, int b) {
        this.s = s;
        this.b = b;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public void eat(){
        System.out.println("动物吃东西");
    }
}
