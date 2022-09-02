package com.it5;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");

    }
    public static  void method(){
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);//new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("索引越界");
//            e.printStackTrace();//错误信息输出控制台
            System.out.println(e.getMessage());//异常原因
        }
    }
}
