package com.it26pm;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {
    public static void main(String[] args) throws IOException {
        //在D:\itcast目录下创建一个文件java.txt
        File f1 = new File("D:\\itcast\\java.txt");
        System.out.println(f1.createNewFile());
//在D：\itcast目录下创建一个目录Java SE
        File f2 = new File("D:\\itcast\\JAVASE");
        System.out.println(f2.mkdir());
        //在D:\\itcast目录下创建一个多级目录JAVAWEB\\HTML
        File f3 = new File("D:\\itcast\\JAVAWEB\\HTML");
        System.out.println(f3.mkdirs());

    }
}
