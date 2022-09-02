package com.it25;

import java.util.Random;

public class Test21 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arr ={-1,-1,-1,-1,-1};
        StringBuilder stringBuilder = new StringBuilder();
        while (true){
            int num = random.nextInt(101);
            String s = String.valueOf(arr);

            if(!s.contains(num+"")){

                stringBuilder.append(num);
                if(stringBuilder.length() == 5){
                    String s1 = stringBuilder.toString();
                    char[] arr1 = s1.toCharArray();
                    for (int i = 0; i < 5; i++) {
                        arr[i] = arr1[i];
                    }
                    for (int i = 0; i < arr1.length; i++) {
                        System.out.println(arr1[i]);
                    }
                    break;
                }
            }
        }

    }
}
