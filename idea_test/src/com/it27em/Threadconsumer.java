package com.it27em;

import java.util.ArrayList;
import java.util.List;

/*使用wait()和notify()方法实现生产者和消费者模式
* 生产者和消费者要达到均衡，这是一种特殊的业务需求，在这种特殊的情况使用wait和notify方法
* wait方法让正在0对象上活动的t进入等待状态，并且释放t线程之前占有的o对象的锁
* notify方法让正在o对象上等待的线程唤醒，只是通知，不会释放o对象上之前占有的锁，这两个方法是建立在线程同步的基础之上
* ，因为多线程要同时操作一个仓库，有线程安全问题*/
/*模拟这样的需求：
* 仓库我们采用list集合，list集合中假设只能存储一个元素，一个元素表示存储满了，如果为0,表示为空，保证list集合中永远最多存储一个元素*/
public class Threadconsumer {
    public static void main(String[] args) {
//        创建一个共享的仓库对象
        List list = new ArrayList();
//        创建生产和消费者线程
        Thread t1 = new Thread(new producer(list));
        Thread t2 = new Thread(new Consumer(list));
        t1.setName("生产者线程");
        t2.setName("消费者线程");
        t1.start();
        t2.start();
    }
}
//生产线程
class producer implements Runnable{
    private List list;

    public producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
//       使用死循环来模拟一直生产
        while(true){
            //给仓库对象list加锁
            synchronized (list){
                if(list.size()>0){//大于0，说明仓库中已经有一个元素了
                    try {
                        list.wait();//当前线程进入等待状态，并且释放Producer之前占有的list集合的锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序能够执行到这里说明仓库是空的，可以生产
                Object o = new Object();
                list.add(o);
                System.out.println(Thread.currentThread().getName()+"--->"+o);
                //唤醒消费者进行消费，这里用notify和notifyAll都行
                list.notify();
            }
        }

    }
}

//消费线程
class Consumer implements Runnable{
    private List list;

    public Consumer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
//一直消费
        while(true){
            synchronized (list){
                if(list.size()==0){
                    try {
                        //仓库已经空了，消费者线程等待，释放掉list集合的锁
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序能够执行到此处说明仓库中有数据，进行消费
                Object o = list.remove(0);
                System.out.println(Thread.currentThread().getName()+"--->"+o);
                //唤醒生产者生产
                list.notify();
            }
        }
    }
}