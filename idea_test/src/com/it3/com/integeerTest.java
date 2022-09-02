package com.it3.com;

//import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class integeerTest {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        String[] strArray = s.split(" ");
//        int[] arr={12,24,45};
        int[] arr = new int[strArray.length];
        for(int i =0;i<arr.length;i++){
            arr[i]=Integer.parseInt(strArray[i]);
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<arr.length;i++){
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]+" ");
            }

        }
        String result= sb.toString();
        System.out.println(result);
    }


}
