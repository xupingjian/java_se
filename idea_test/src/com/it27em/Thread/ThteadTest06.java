package com.it27em.Thread;
/*希望唤醒睡眠的线程*/
public class ThteadTest06 {
    public static void main(String[] args) {
        mythread1 t = new mythread1();
        t.start();

        //5秒后，唤醒t线程
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }//模拟5秒后
        t.interrupt();//中断t线程的睡眠（利用中段睡眠的方式依靠了java的异常处理机制）让语句进入到catch中执行打印异常
//        System.out.println("hello");

    }
}
class mythread1 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"--->begin");
        try {
            Thread.sleep(1000*60*60*24*365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"--->end");
    }
}