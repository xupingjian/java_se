package com.it27em;
//面试：doOther方法执行的时候需要等待doSome方法的结束吗？
public class Exam {
    public static void main(String[] args) throws InterruptedException {
        Myclass mc = new Myclass();
        Mythread t1 = new Mythread(mc);
        Mythread t2 = new Mythread(mc);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        Thread.sleep(1000);//让t1先执行
        t2.start();

    }
}
class Mythread extends Thread{
    private Myclass mc;

    public Mythread(Myclass mc) {
        this.mc = mc;
    }

    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("t1")){
            mc.doSome();
        }
        if(Thread.currentThread().getName().equals("t2")){
            mc.doOther();
        }
    }
}
class Myclass{
    public synchronized void doSome(){
        System.out.println("doSome begin");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome over");
    }
    public void doOther(){
        System.out.println("doOther begin");

        System.out.println("doOther over");
    }
}