package com.it27pm.reflect;
/*可变长度参数:0-N个参数
*可变参数只能有一个并且只能放在后面
* 可变参数可以当作一个数组来看待*/
public class Reflect10 {
    public static void main(String[] args) {

        m(12,23,6,64);
        m(1,"fws");
//        可变参数可以当作一个数组来看待
        m(new String[]{"abc","qfwsf","sfwfg"});
    }
    public static void m(int... args){
        System.out.println("m方法被执行");
    }


    public static void m(int i,String... args){
        System.out.println("hahah");
    }
    public static void m(String... args){
        for(int i =0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
