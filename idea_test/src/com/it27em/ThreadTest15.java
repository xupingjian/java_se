package com.it27em;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest15 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //第一步：创建一个“未来任务类”对象
        //参数非常重要，需要给一个Callable接口实现类对象
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                //模拟线程执行返回a+b的值
                System.out.println("call begin");
                Thread.sleep(1000*10);
                System.out.println("call end");
                int a= 1;
                int b = 2;
                return a+b;
            }
        });

        Thread t1 = new Thread(task);
        t1.start();

//       在主线程怎么获取t1线程的返回结果
        Object o = task.get();
        System.out.println(o);
        /*main线程必须等get()方法的结束才能继续执行下面的代码（有点类似join）*/
        System.out.println("main 线程继续执行");
    }
}
