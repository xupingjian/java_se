package com.it26am.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//一次读一个数组
public class Test2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("javase");//用相对路径是必须保证该文件在IDEAL的默认路径（在项目直接新建文件就是IDEAL的默认路径）
            //准备一个数组
            byte[] bytes = new byte[4];
            while (true){
                int  readCount = fis.read(bytes);//第一次读到abcd，第二次读到ef,数组里变成efcd(实际读到长度2),第三次什么也没读到，返回-1
                if(readCount == -1){
                    break;
                }
                System.out.print(new String(bytes,0,readCount));//数组转换为字符
            }
            /*int readCount = 0;
            while((readCount = fis.read())!=-1){
                System.out.print(new String(bytes,0,readCount));
            }*/

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
