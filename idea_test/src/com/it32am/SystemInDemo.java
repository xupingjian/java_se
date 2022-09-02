package com.it32am;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInDemo {
    public static void main(String[] args) throws IOException {
/*        InputStream is = System.in;//标准输入流(字节流）
*//* 字节流读       int by;
        while((by=is.read())!=-1){
            System.out.print((char)by);*//*
        //如何把字节流转换为字符流？用转换流
        InputStreamReader isr = new InputStreamReader(is);
        //使用字符流能实现一次读一行数据，用字符缓冲流的特有方法
        BufferedReader br = new BufferedReader(isr);*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符串");
        String line = br.readLine();
        System.out.println("你输入的字符串是："+line);
        System.out.println("请输入一个整数：");
        int i = Integer.parseInt(br.readLine());
        System.out.println("请输入以个整数："+ i);
//        System.out.print();
    }
    }

