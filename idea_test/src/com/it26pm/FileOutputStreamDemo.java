package com.it26pm;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("idea_test\\fos.txt");
        //同时完成了1.调用系统功能创建了文件 2.创建了字节输出流对象 3.让字节输出对象指向创建好的文件
/*        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.write(100);
        fos.write(101);
        fos.close();*/
//        byte[] bys ={99,101,126,12};
        byte[] bys = "abcde".getBytes(StandardCharsets.UTF_8);
//        fos.write(bys);

        fos.write(bys,0, bys.length-1);
        fos.close();
    }
}
