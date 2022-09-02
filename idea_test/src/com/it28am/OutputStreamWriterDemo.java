package com.it28am;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("idea_test\\osw.txt"));
        //void write(int c)写一个字符
 /*       osw.write(97);
        //void flush(): 刷新流的缓冲，可继续写入
        osw.flush();
        osw.write(98);
        osw.flush();
        osw.write(99);

        osw.close();
//        osw.write(100);//不可继续写入数据*/
        //void write (char[] cbuf)：写入一个字符数组
        char[] chs = {'a','b','c','d','e'};

//        osw.write(chs);
//        void write(char[] cbuf,int off,int len):写入字符数组的一部分
//        osw.write(chs,0,chs.length-1);

        //woid write （String str):写一个字符串
//        osw.write("abcdefg");

        //void write(String str,int off,int len）:写入一个字符串的一部分
//        osw.write("abcde",0,"abcde".length());
        osw.write("abcdde",1,3);
        osw.close();

    }
}
