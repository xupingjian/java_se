package com.it27em;
/*守护进程：只要用户进程结束，不管守护进程是否结束，必须马上结束*/
public class ThreadTest {
    public static void main(String[] args) {
        BakDataThread t = new BakDataThread();
        t.setName("备份数据的线程");
        t.setDaemon(true);
        t.start();
        //主线程：主线程是用户线程
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class BakDataThread extends Thread{

    @Override
    public void run() {
        int i = 0;
        while(true){
            System.out.println(Thread.currentThread().getName()+"--->"+(++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


