package com.it27am;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileDemo {
    public static void main(String[] args) {
//        try{
//            FileOutputStream fos = new FileOutputStream("idea_test\\fos3.txt");
//            fos.write("hello".getBytes(StandardCharsets.UTF_8));
//            fos.close();//在出现异常后并没有执行
//        }catch(IOException e){
//            e.printStackTrace();
//        }
        //加入finally来实现释放资源
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("idea_test\\fos3.txt");
            fos.write("hello".getBytes(StandardCharsets.UTF_8));
//            fos.close();//在出现异常后并没有执行
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
            fos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
