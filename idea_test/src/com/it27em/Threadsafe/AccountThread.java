package com.it27em.Threadsafe;

public class AccountThread extends  Thread{
    //通过构造方法传递一个账户对象来共享这个账户对象
    private Account act;

    public AccountThread(Account act) {
        this.act = act;
    }

    @Override
    public void run() {
        //run方法的执行表示取款操作
        //假设取款5000
        double money = 5000;
        //取款
        act.withdarw(money);
        System.out.println(Thread.currentThread().getName()+"对"+act.getActno()+"取款"+money+"成功，余额"+act.getBalance());
    }
}
