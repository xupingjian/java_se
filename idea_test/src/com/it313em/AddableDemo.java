package com.it313em;

public class AddableDemo {
    public static void main(String[] args) {
        useAddable((int a,int b)->
//            return a+b;
            a-b);
    }
    private static void useAddable(Addable a){
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
