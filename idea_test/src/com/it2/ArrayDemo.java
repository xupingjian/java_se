package com.it2;

//import org.w3c.dom.ls.LSOutput;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        System.out.println("排序前:" + arrayToString(arr));

      /* *//* for (int i = 0; i < arr.length - 1-0; i++) {
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        System.out.println("第一次排序后" + arrayToString(arr));

        for (int i = 0; i < arr.length - 1-1; i++) {
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        System.out.println("第二次排序后" + arrayToString(arr));


        for (int i = 0; i < arr.length - 1-2; i++) {
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }*//*
        }

        System.out.println("第三次排序后" + arrayToString(arr));
//每次数组减去的数为不参与下次比较的数
        for (int i = 0; i < arr.length - 1-3; i++) {
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        System.out.println("第四次排序后" + arrayToString(arr));*/
        for(int x=0;x<arr.length-1;x++) {
            for (int i = 0; i < arr.length - 1 - x; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println(arr.length-1+"次排序后" + arrayToString(arr));
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;

    }
}


