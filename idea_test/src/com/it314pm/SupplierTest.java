package com.it314pm;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        int[] arr ={19,50,28,37,46};
        //lambda表达式获取数组最大值
        int maxValue = getMax(() -> {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        });
        System.out.println(maxValue);
    }
    private static  int getMax(Supplier<Integer> sup){
        return sup.get();
    }
}
