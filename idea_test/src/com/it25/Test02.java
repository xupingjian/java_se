package com.it25;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        int[] arr = {1,4,5,2,3};
        Arrays.sort(arr);
        int i = Arrays.binarySearch(arr, 2);
        System.out.println(i);
    }
}
