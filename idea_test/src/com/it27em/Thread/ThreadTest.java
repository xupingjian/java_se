package com.it27em.Thread;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();//新建一个线程对象
//        myThread.run();//这种不会启动第二个线程（相当于调用MyThread的run方法）
        myThread.start();//start()方法的作用是启动一个分支线程，在JVM开辟一个新的栈空间，启动成功的线程会自动调用run方法
        //run方法和main方法都在各自栈的底部
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程："+i);

        }
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        //这段线程运行在分支线程中
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程:"+i);
        }
    }
}
