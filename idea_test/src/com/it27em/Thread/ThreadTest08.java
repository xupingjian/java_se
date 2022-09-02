package com.it27em.Thread;

public class ThreadTest08 {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(1);
        System.out.println("最高优先级"+Thread.MAX_PRIORITY);
        System.out.println("最低优先级"+Thread.MIN_PRIORITY);
        System.out.println("默认优先级"+Thread.NORM_PRIORITY);
//        System.out.println(Thread.currentThread().getName()+"线程默认优先级："+Thread.currentThread().getPriority());
        Thread t = new Thread(new Myrunnable5());
        t.setPriority(10);
        t.setName("t");
        t.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"主线程"+i);
        }
    }
}
class Myrunnable5 implements Runnable{

    @Override
    public void run() {
//        System.out.println(Thread.currentThread().getName()+"线程优先级："+Thread.currentThread().getPriority());
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"t线程"+i);
        }
    }
}