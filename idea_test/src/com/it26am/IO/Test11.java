package com.it26am.IO;

import java.io.*;

public class Test11 {
    public static void main(String[] args) throws FileNotFoundException {
        //改变标准输出字节流指向“log"文件
        PrintStream printStream = new PrintStream(new FileOutputStream("log"));
        //修改输出方向,将输出方向修改到"log"文件
        System.setOut(printStream);
        System.out.println("sgweiogheq2ih");
    }
}
