package com.it32am;

import java.io.FileNotFoundException;
import java.io.PrintStream;
//(字节）打印流的特点：只负责输出数据，不负责读取数据，有自己的特有方法
public class PrintStringDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("idea_test\\osw1.txt");
        //字节输出流写数据方法(会自动转码）
//        ps.write(97);
//使用特有方法写数据(不会转码）
        ps.println(97);
        ps.println(98);
        ps.println("中国");
    }
}
