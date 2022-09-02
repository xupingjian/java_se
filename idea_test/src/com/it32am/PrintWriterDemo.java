package com.it32am;

import java.io.*;

/*字符打印流的构造方法：printWriter(String filename):使用指定的文件名创建一个新的printWriter,而不需要自动执行行刷新
*
* printWriter(Writer(Writer out,boolean autoFlush):创建一个新的printWriter*/
public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter("idea_test\\osw1.txt");
//        printWriter.write("hello");
//        printWriter.write("\r\n");
//        printWriter.flush();

   /*     printWriter.println("hello");
        printWriter.flush();*/
        PrintWriter pw = new PrintWriter(new FileWriter("idea_test\\osw1.txt"),true);
        pw.println("hee");
        pw.println("sfgedg");
    }
}
