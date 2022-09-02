package com.it22pm;

public class Array {
    public static void main(String[] args) {
        System.out.println(args.length);
        int[] a ={1,2,3,4,45};
        int length = a.length;
        printArray(a);
        //直接传一个静态数组
        printArray(new int[]{2,4,6,89,68});

    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
