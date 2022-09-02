package com.it27am;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("idea_test\\fos.txt");
        //int read(byte[] b):从该输入流读取最多b.length个字节的数据到一个字节数组
/*        byte[] bys = new byte[5];

        //第一次读数据
        int len = fis.read(bys);
        System.out.println(len);
        System.out.println(new String(bys,0,len));
        //第二次读数据
        len  = fis.read(bys);
        System.out.println(len);
        System.out.println(new String(bys,0,len));

        //第三次
        len  = fis.read(bys);
        System.out.println(len);
        System.out.println(new String(bys,0,len));//len返回的是实际读取的数据个数
      *//*  hell0\r\n
      *   world\r\n
      *
      *
      * *//*
        len  = fis.read(bys);
        System.out.println(len);
        System.out.println(new String(bys,0,len));//len返回的是实际读取的数据个数*/

        //循环改进
        byte[] bys =new byte[1024];//1024及其整数倍
        int len;
        while((len = fis.read(bys))!=-1){
            System.out.println(new String(bys,0,len));
        }

        fis.close();
    }
}
