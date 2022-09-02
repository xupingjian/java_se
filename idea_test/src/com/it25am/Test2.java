package com.it25am;

public class Test2 {
    public static void main(String[] args) {
        int result = m();
        System.out.println(result);//100
    }
    /*java中方法体中的代码自上而下执行遇到return,方法结束*/
    public static int m(){
        int i = 100;
        try{
            return  i;
        }finally {
            i++;
        }
    }
}
