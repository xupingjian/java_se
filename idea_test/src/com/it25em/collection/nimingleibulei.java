package com.it25em.collection;

public class nimingleibulei {
    public static void main(String[] args) {
        run(new Animals() {
            @Override
            public void eat() {
                System.out.println("匿名内部类");
            }
        });
    }
    public static void run(Animals a){
        a.eat();
    }
}
interface Animals{
    public abstract void eat();
}
