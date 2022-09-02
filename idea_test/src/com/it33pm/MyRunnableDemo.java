package com.it33pm;
/*
* 方法2：实现Runnale接口
* 1.定义一个类MyRunnable实现Runnable接口
* 2.在MyRunnable类中重写run()方法
* 3.创建MyRunnable类的对象
* 4,创建Thread类的对象,把MyRunnable对象作为构造方法的参数
* 5.启动线程*/
public class MyRunnableDemo {
    public static void main(String[] args) {
        Runnable my = new MyRunnable();
        //Thread(Runnable target,String name)
        Thread t1 = new Thread(my,"飞机");
        Thread 她 = new Thread(my);
        t1.start();
        她.start();

    }
}
