package com.it27em.Thread;

public class ThreadTest07 {
    public static void main(String[] args) {
        thread t = new thread();
        Thread t1 = new Thread(t);
        t1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.run = false;//中止线程
    }
}
class thread implements Runnable{
    boolean run = true;
    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            if(run){
                System.out.println(Thread.currentThread().getName()+"--->"+i);
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                return;//终止线程（可以在return前保存数据）
            }
        }

    }
}