package com.it27em.Threadsafe;

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

        //t1和t2并发这个方法（t1和t2是两个栈，两个栈操作堆中的同一个账户对象）
        //取款之前的余额
        double before = this.getBalance();
        //取款之后的余额
        double after = before-money;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //假如t1执行到这里，但是还没来的及执行这行代码，t2线程进来withdraw方法,此时一定出问题

        //更新余额
        this.setBalance(after);
    }
}
