package com.it27em.Thread;
/*Thread.yield（）让位方法*/
public class ThreadTest09 {
    public static void main(String[] args) {

//        System.out.println(Thread.currentThread().getName()+"线程默认优先级："+Thread.currentThread().getPriority());
        Thread t = new Thread(new Myrunnable6());
//        t.setPriority(10);
        t.setName("t");
        t.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + "主线程" + i);
        }
    }
}

class Myrunnable6 implements Runnable {

    @Override
    public void run() {
//        System.out.println(Thread.currentThread().getName()+"线程优先级："+Thread.currentThread().getPriority());
        for (int i = 0; i < 1000; i++) {
            if (i % 10 == 0){
                Thread.yield();//暂停当前线程，让给主线程
            }
                System.out.println(Thread.currentThread().getName() + "t线程" + i);
        }
    }
}