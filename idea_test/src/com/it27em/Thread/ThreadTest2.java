package com.it27em.Thread;

public class ThreadTest2 {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();//创建一个可运行的对象
        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程："+i);

        }
    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        //这段线程运行在分支线程中
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程:"+i);
        }
    }
}