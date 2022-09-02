package com.it27em;

import com.it26pm.FileOutputStreamDemo;

import java.io.*;

public class conversionStreamDemo {
    public static void main(String[] args) throws IOException {
//        OutputStreamWriter(outputStream out)创建一个使用默认字符编码的OutputSteamWriter,OutputStreamWriter是从字符流到字节流的桥梁
//        OutputStreamWriter(outputStream out,String charsetName)创建一个使用名字字符集的OutputStreamWriter
//    OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("idea_test\\osw.txt"));
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("idea_test\\osw.txt"),"UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("idea_test\\osw.txt"),"GBK");

        osw.write("中国");
        osw.close();
//        InputStreamReader(InputStream in)创建一个使用默认字符集的InputStreamReader,InputStreamReader是从字节流到字符流的桥梁
//        InputStreamReader(InputStream in,String charsetName)创建一个使用命名字符集的InputStreamReader
        InputStreamReader isr  = new InputStreamReader(new FileInputStream("idea_test\\osw.txt"),"GBK");

        //一次读取一个字符数据
        int ch;
        while((ch=isr.read())!=-1){
            System.out.println((char)ch);
        }
        isr.close();
    }

}
