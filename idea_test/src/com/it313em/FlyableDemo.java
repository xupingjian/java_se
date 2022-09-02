package com.it313em;

public class FlyableDemo {
    public static void main(String[] args) {
//        Flyable fy = new Flyableimpl();
//        useFlyable(fy);
        //匿名内部类
/*        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("飞机");
            }
        });*/
        //lambda
        useFlyable((String s)->{
            System.out.println(s);
            System.out.println("哈哈哈哈");
        });
    }
    private static void useFlyable(Flyable f){
        f.fly("风和日丽");
    }
}
