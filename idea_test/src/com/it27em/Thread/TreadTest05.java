package com.it27em.Thread;

import java.util.concurrent.ThreadPoolExecutor;

public class TreadTest05 {
    public static void main(String[] args) {
        //创建线程对象
        Thread t = new MyThread3();
        t.setName("t");
        t.start();
        //这里的sleep会让线程t进入休眠吗(不会，因为sleep是静态方法，看着是t对象调用了（静态方法调用和对象没关系），
        // 实则是Thread.sleep(),让main线程睡眠了)
        try {
            t.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello world");
    }
}
class MyThread3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
