package com.it25;

public class Test22 {
    public static void main(String[] args) {
        System.out.println(max(3.1,40.4,-4,34));
    }//可变参数
    public static double max(double... values){
        double largest = Double.NEGATIVE_INFINITY;
        for(double v :values)
            if(v>largest)
                largest=v;
        return largest;
    }
}
