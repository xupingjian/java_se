package com.it26am.IO;
/*文件字符输入流，只能读文本*/
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test6 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("javase");
            //读，与FileinoutStream相比只是将字节数组换成字符数组就可以了
            char[] chars = new char[4];
            int readCount = 0;
            while ((readCount = reader.read(chars))!=-1){
                System.out.print(new String(chars,0,readCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
