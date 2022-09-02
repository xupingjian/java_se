package com.it26am.IO;
/*文件的复制，先将要拷贝的文件读入到内存，再从内存写出到目标文件*/
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos  =null;
        try {
            fis = new FileInputStream("D:\\FFOutput\\1.mp4");
            fos = new FileOutputStream("file1");

            //最核心：一边读一边写
            byte[] bytes = new byte[1024 * 1024];
            int readCount = 0;
//            System.out.println(readCount);
            while ((readCount=fis.read(bytes))!=-1){
                System.out.println(readCount);
                fos.write(bytes,0,readCount);
            }
            fos.flush();//刷新
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
