package com.it27em.exam;

//面试：doOther方法执行的时候需要等待doSome方法的结束吗？(这种需要等待，尽管是两个对象，但是因为静态方法是类锁，不管创建了几个对象，类锁只有一把)
public class exam1 {
    public static void main(String[] args) throws InterruptedException {
        Myclass1 mc1 = new Myclass1();
        Myclass1 mc2 = new Myclass1();
        Mythread1 t1 = new Mythread1(mc1);
        Mythread1 t2 = new Mythread1(mc2);
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
    //synchronized出现在静态方法上是找类锁
    public synchronized static void doSome(){
        System.out.println("doSome begin");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome over");
    }
    public synchronized static void doOther(){
        System.out.println("doOther begin");

        System.out.println("doOther over");
    }
}