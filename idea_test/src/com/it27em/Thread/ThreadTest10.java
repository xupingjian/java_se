package com.it27em.Thread;
/*线程合并*/
public class ThreadTest10 {
    public static void main(String[] args) {
        System.out.println("main begin");
        Thread t = new Thread(new runn());
        t.setName("t");
        t.start();
        //合并线程
        try {
            t.join();//t合并到当前线程中，当前线程手阻塞，t线程执行直到结束
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程开始");
    }
}
class runn implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}