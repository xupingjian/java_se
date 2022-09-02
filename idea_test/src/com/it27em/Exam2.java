package com.it27em;

//面试：doOther方法执行的时候需要等待doSome方法的结束吗？(这里是需要等待的，因为两个方法都加了synchronized)
public class Exam2 {
    public static void main(String[] args) throws InterruptedException {
        Myclass1 mc = new Myclass1();
        Mythread1 t1 = new Mythread1(mc);
        Mythread1 t2 = new Mythread1(mc);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        Thread.sleep(1000);//让t1先执行
        t2.start();

    }
}
class Mythread1 extends Thread{
    private Myclass1 mc;

    public Mythread1(Myclass1 mc) {
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
class Myclass1{
    public synchronized void doSome(){
        System.out.println("doSome begin");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome over");
    }
    public synchronized void doOther(){
        System.out.println("doOther begin");

        System.out.println("doOther over");
    }
}