package com.it25am;
/*获取异常简单的描述信息
* String msg = exception.getMessage();
* 打印异常追踪的堆栈信息:
* exception.printStackTrace();*/
public class Test1 {
    public static void main(String[] args) {
        NullPointerException e = new NullPointerException("空指针异常");
        //获取异常简单描述信息：这个信息实际上就是构造方法上面String参数
        String msg  = e.getMessage();
        System.out.println(msg);
        //打印异常堆栈信息，Java后台有专门的线程来负责
        e.printStackTrace();
        //异常处理机制对异常进行处理了，不会影响后续程序执行，这体现了异常处理机制对程序起的健壮性

        for (int i = 0; i < 1000; i++) {
            System.out.println("hello");

        }
    }
}
