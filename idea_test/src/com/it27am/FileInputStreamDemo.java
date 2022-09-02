package com.it27am;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("idea_test\\fos2.txt");

/*        int by = fis.read();
        System.out.println((char)by);
        fis.close();*///读一个字节的内容
/*        int by = fis.read();
        while(by!=-1){
            System.out.print((char)by);
            by = fis.read();
        }*/
        //升级版字节流读数据
        int by;
        while((by = fis.read())!=-1){
            System.out.println((char)by);
        }

    }
}
