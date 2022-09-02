package com.it313pm;

public class EatableDemo {
    public static void main(String[] args) {
//在主方法中调用useEatable方法
//        Eatableimpl e = new Eatableimpl();
//        useEatable(e);
        //匿名内部类
 /*       useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("吃苹果");
            }
        });*/
        //lambda表达式
        useEatable(()->{
            System.out.println("吃苹果");
        });
    }
    private static void useEatable(Eatable e){
        e.eat();
    }
}
