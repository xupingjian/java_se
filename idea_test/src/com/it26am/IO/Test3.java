package com.it26am.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*FileInoutStream类的其它常用方法：
*  int available(): 返回流中剩余的没有读到到的字节数量
* long skip(long n)：跳过几个字节不读*/
public class Test3 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("javase");
            System.out.println("总字节数量:"+fis.available());//fis.available可以获取总字节数量
            int reagByte = fis.read();//读了一个字节，还剩5个字节
            System.out.println("还剩"+fis.available());
            long skip = fis.skip(2);
            byte[] bytes = new byte[1];
            int read = fis.read(bytes);
            System.out.println(new String(bytes,0,read));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
