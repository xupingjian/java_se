package com.it27em.Treadsafe2;
/*使用线程同步机制，多线程对同一个账户取款，不会出现线程安全问题*/
public class Account {
    private String actno;
    private double balance;

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    //取款
    public void withdarw(double money){
//以下这几行代码必须是线程排队的，不能并发，一个线程把这里的代码全部执行结束之后，另一个线程才能进来
        /*线程同步机制的语法是：
        * synchronized(){
        * //线程同步代码块
        * }*/
//        synchronized后面的小括号中传的是多线程共享的数据，才能达到多线程排队
        /*（）中写的是你需要哪几个线程同步的共享对象，假如t1,t2,t3 3个线程，你希望t1,t2,排队，（）里写一个t1,t2共享的对象，对于t3来说不是共享的*/
        /*代码执行原理：假设t1和t2线程并发，开始执行以下代码的时候，肯定有一个先有一个后，假如t1先执行了，遇到了synchronized,这个时候自动找”后面
        * 的对象锁，找到并占有这把锁，然后执行同步代码块的程序，在执行过程中一直占有这把锁，直到同步代码块结束，释放这把锁，如果没执行完代码块，此时t2只能等待，
        * 这就达到了线程排队执行。这里需要注意的是这个共享对象一定是你需要排队执行的这些线程对象所共享的*/
        //取款之前的余额
        synchronized (this){
            double before = this.getBalance();
            //取款之后的余额
            double after = before-money;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //更新余额
            this.setBalance(after);
        }


    }
//    当共享对象就是this时，可把synchronized放在实例方法上
/*    public synchronized void withdarw(double money){
        double before = this.getBalance();
        //取款之后的余额
        double after = before-money;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //更新余额
        this.setBalance(after);
    }*/
    }

