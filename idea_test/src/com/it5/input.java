package com.it5;


import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("numbers");
        int k = in.nextInt();

        System.out.println("high number");
        int n = in.nextInt();
        //填数
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;

        }
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            //选索引从0到n-1
            int r = (int)(Math.random()*n);
            result[i] = numbers[r];
            //用最后一个替换抽出来的
            numbers[r]  = numbers[n-1];
            n--;

        }
        Arrays.sort(result);

        for (int r:result
             ) {
            System.out.println(r);

        }
    }


}

