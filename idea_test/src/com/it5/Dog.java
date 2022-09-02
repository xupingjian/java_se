package com.it5;

import com.it4.Animal;

public class Dog extends Animal {
    @Override
    public void eat() {
        super.eat();
        this.s="fw";
    }
}
