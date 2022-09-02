package com.it26am.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Test4 {
    public static void main(String[] args) {
        FileOutputStream fos  = null;
        try {
            fos = new FileOutputStream("myfile",true);

            //怎么写
            byte[] arr ={100,120,127};
            fos.write(arr);
            fos.write(arr,0,2);//再写两个，如果希望每次都是追加写入，需要在输出流添加true属性

            String s ="我是一个中国人";
            byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
            fos.write(bytes);
            fos.flush();//写完一定要记得刷新
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
