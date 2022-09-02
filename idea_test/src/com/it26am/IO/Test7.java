package com.it26am.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test7 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("javase");
        BufferedReader bf = new BufferedReader(reader);
        //一次读一个字符数组
/*        char[] arr = new char[4];
        int readcount= 0;
        while ((readcount = bf.read(arr))!=-1){
            System.out.println(arr);
        }*/
//一次读一行
/*        String s = bf.readLine();
        System.out.println(s);*/
        String s =null;
        while ((s= bf.readLine())!=null){
            System.out.println(s);
        }
        bf.close();
    }
}

