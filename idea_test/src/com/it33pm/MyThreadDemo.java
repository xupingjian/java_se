package com.it33pm;
/*
方式1：继承Thread类
        1:定义一个MyThread继承Thread类
        2：在MyThread类中重写run()方法
        3.创建Mythread类的对象
        4:启动线程
*/

public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();
        MyThread my3 = new MyThread();
//        my1.run();
//        my2.run();
        //void setName(String name)：将此线程的名称更改为等于参数name
        my1.setName("高铁");

        my2.setName("飞机");
        my3.setName("汽车");
        Thread.currentThread().setName("大炮");
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
        my1.setDaemon(true);//将此线程标记为守护线程，当运行的线程都是守护线程时，java虚拟机机会退出
        my2.setDaemon(true);
        my3.setDaemon(true);
        //void start()导致此线程开始执行；Java虚拟机调用线程的run方法
/*        MyThread my1 = new MyThread("高铁");
        MyThread my2 = new MyThread("飞机");*/
/*        System.out.println(my1.getPriority());
        System.out.println(my2.getPriority());
//        System.out.println(my3.getPriority());*///线程优先级默认值为5
//        my1.setPriority(10);
//        my2.setPriority(1);
//        my3.setPriority(3);

        my1.start();
        //void join():等待线程死亡
/*        try {
            my1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        my2.start();
        my3.start();
    }
}
