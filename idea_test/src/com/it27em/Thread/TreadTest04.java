package com.it27em.Thread;
/*线程的sleep方法(静态方法)让当前的线程进入休眠状态（阻塞状态），放弃当前的执行权，让给其他线程使用*/
public class TreadTest04 {
    public static void main(String[] args) {
/*        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello word");*///5秒后执行输出

        //每隔一秒执行for循环里的语句
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
