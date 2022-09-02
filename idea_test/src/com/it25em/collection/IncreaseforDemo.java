package com.it25em.collection;

public class IncreaseforDemo {
    public static void main(String[] args) {
        int[] arr = {1243,353,56,65,23,234};
        //增强for语法 for(元素类型 变量名 ： 数组或集合){System.out.println(变量名);}，有一个缺点，没有下标，
        //在需要使用下标时不能用增强for循环
        for (int a :arr
             ) {
            System.out.println(a);
        }
    }
}
