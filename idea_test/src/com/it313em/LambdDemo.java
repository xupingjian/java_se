package com.it313em;

public class LambdDemo {
    public static void main(String[] args) {
/*        userInter(()->{
            System.out.println("好好学习");
        });*/
        //使用Lambda表达式必须要有接口，并且要求接口中有且仅有一个抽象方法
//        userInter(()-> System.out.println("好好学习"));//大括号和分号可省略
        //必须有上下文环境，才能推导出lambda对应的接口
/*        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        }).start();*/
        //必须有上下文环境，才能推导出lambda对应的接口
/*        Runnable r = () -> System.out.println("lambda表达式");
        new Thread(r).start();*/
        new Thread(() -> System.out.println("lambda表达式")).start();
    }
    private static void userInter(Inter i){
        i.show();
    }
}
