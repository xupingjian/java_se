package com.it25am;

public class ArgsDemo01 {
    public static void main(String[] args) {
        System.out.println(sum(12,234,44354,5565));
        System.out.println(sum(12,3536,645));
        System.out.println(sum(121,535,36437));
    }
    public static  int sum(int... a){
        int sum = 0;
        for(int i:a){
            sum +=i;

        }
        return sum;
    }
}
