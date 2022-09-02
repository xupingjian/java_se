package com.it28em;

import java.io.*;

public class CopyJavaDemo02 {
    public static void main(String[] args) throws IOException {
        method();


    }
    public static void method() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("idea_test\\Copy.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("idea_test\\Copy1.java"));
        //使用字符缓冲流特有功能实现读写数据，复制文件
        String line;
        while((line= br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
