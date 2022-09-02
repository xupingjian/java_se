package com.it314pm;
/*定义一个类（RunnableDemo),在类中提供两个方法
* 一个方法是：startThread(Runnable r)方法参数Runnable是一个函数式接口
* 一个方法是主方法，在主方法中调用startThread方法*/
public class RunnableDemo {
    public static void main(String[] args) {
        //匿名内部类方式
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程启动了");
            }
        });
        //lambda表达式作为参数传递
        startThread(()->System.out.println(Thread.currentThread().getName()+"线程启动了"));
    }
    private static void startThread(Runnable r){
//        Thread t = new Thread(r);
//        t.start();
        new Thread(r).start();
    }
}
