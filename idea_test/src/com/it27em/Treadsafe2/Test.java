package com.it27em.Treadsafe2;

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
