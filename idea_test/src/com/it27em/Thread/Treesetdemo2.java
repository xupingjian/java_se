package com.it27em.Thread;

public class Treesetdemo2 {
    public static void main(String[] args) {
        //匿名内部类来实现创建线程对象
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("分支线程:" + i);
                }
            }
        });
        t.start();//启动线程
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程:"+i);
        }
    }
}
