package com.it27em.Thread;

public class ThreadTest3 {
    public static void main(String[] args) {
        MyThread1 myThread = new MyThread1();//新建一个线程对象
        Thread thread = Thread.currentThread();//获取当前线程对象
        System.out.println(thread.getName());//当前线程在main方法里，则当前线程为main
//        myThread.run();//这种不会启动第二个线程（相当于调用MyThread的run方法）
        String name = myThread.getName();//获取线程的名字(默认Thread-0)
        System.out.println(name);
        myThread.setName("t1线程");//修改线程对象的名字
        System.out.println(myThread.getName());
        myThread.start();//start()方法的作用是启动一个分支线程，在JVM开辟一个新的栈空间，启动成功的线程会自动调用run方法
        //run方法和main方法都在各自栈的底部

        MyThread1 myThread1 = new MyThread1();
        myThread1.setName("t2线程");
        myThread1.start();

    }
}

class MyThread1 extends Thread{
    @Override
    public void run() {
        //这段线程运行在分支线程中
        for (int i = 0; i < 100; i++) {
            Thread t = Thread.currentThread();
            System.out.println(t.getName());
//            System.out.println("分支线程:"+i);
        }
    }
}

