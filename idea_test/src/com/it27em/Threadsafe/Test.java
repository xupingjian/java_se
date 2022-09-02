package com.it27em.Threadsafe;
/*不使用线程同步机制，多线程对同一个账户取款，会出现线程安全问题*/
public class Test {
    public static void main(String[] args) {
        Account account = new Account("act-001",10000);
        //t1,t2共享一个account对象
        AccountThread t1 = new AccountThread(account);
        AccountThread t2 = new AccountThread(account);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
