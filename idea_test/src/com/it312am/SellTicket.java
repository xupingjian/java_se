package com.it312am;

public class SellTicket<sellTicket> implements Runnable{
    private static int ticket =100;
    private Object obj = new Object();
    private int x = 0;
    @Override
    public void run() {
        while(true){
            if(x%2==0){
            synchronized (obj){
                if(ticket>0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + "张票");
                    ticket--;
                }
                }
            }else{sellTicket();
            }
        }
    }
    private static synchronized void sellTicket(){


            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + "张票");
            ticket--;



    }
}
