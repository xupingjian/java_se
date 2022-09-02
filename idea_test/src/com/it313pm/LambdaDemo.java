package com.it313pm;

public class LambdaDemo {
    public static void main(String[] args) {
        //1.实现类的方式实现需求/略
        //2.匿名内部类的方式改进
/*        new Thread(new Thread(){
            @Override
            public void run() {
                System.out.println("多线程程序启动了");
            }
        }).start();*/
        //3.lambda表达式的方式改进
        new Thread(()->{
            System.out.println("多线程程序启动了");
        }).start();


    }
}
