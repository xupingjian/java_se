package com.it1;
import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        int[] sb = {1,3,6,7,3,5};
        int[] nb = Arrays.copyOfRange(sb, 4,6);
        int s = Arrays.binarySearch(sb,6);
//        int[] sf = new int[5];
        Arrays.fill(sb,7);
        System.out.println(Arrays.toString(sb));
        System.out.println(s);
        System.out.println(Arrays.toString(nb));

    }
}