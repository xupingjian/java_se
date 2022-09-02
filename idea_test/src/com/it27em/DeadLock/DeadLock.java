package com.it27em.DeadLock;
/*死锁*/
public class DeadLock {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        //m1,m2线程共享o1,o2对象
        Thread m1 = new MyThread1(o1, o2);
        Thread m2 = new MyThread2(o1, o2);
        m1.start();
        m2.start();
    }
}
class MyThread1 extends Thread{
    Object o1;
    Object o2;

    public MyThread1(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }
    @Override
    public void run() {
        synchronized (o1){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2){}
        }
    }


}
class MyThread2 extends Thread{
    Object o1;
    Object o2;

    public MyThread2(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o2){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o1){}
        }
    }
}