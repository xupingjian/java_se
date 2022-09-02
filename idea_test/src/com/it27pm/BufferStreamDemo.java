package com.it27pm;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferStreamDemo {
    public static void main(String[] args) throws IOException {
/*        FileOutputStream fos = new FileOutputStream("idea_test\\fos.txt");
        BufferedOutputStream bis = new BufferedOutputStream(fos);*/
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("idea_test\\fos.txt"));
//        bos.write("hello\r\n".getBytes(StandardCharsets.UTF_8));
//        bos.write("world\r\n".getBytes(StandardCharsets.UTF_8));
//        bos.close();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("idea_test\\fos.txt"));
//        //一次读一个字节的数据
//        int by;
//        while ((by = bis.read()) != -1) {
//            System.out.print((char) by);
//        }
        //一次读取一个字节数组的数据
        byte[] bys = new byte[1024];
        int len;
        while((len=bis.read(bys))!=-1){
            System.out.print(new String(bys,0,len));
        }
    }

}
