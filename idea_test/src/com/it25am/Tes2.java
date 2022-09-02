package com.it25am;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*finally语句块通常完成资源的释放/关闭，finally里的语句一定会执行（前提没碰到System.exit(0)）*/
public class Tes2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        //创建输入流对象
        try {
            fis = new FileInputStream("C:\\Users\\F413Y\\Desktop\\DALI\\versions");
            String s = null;
            s.toString();//空指针异常
            //fis.close();这行代码在发生异常后不会执行，因此需要把这行代码放到finally语句块中
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NullPointerException e){
            e.printStackTrace();
        } finally {
            if(fis!=null){
                try {
                    fis.close();//close方法有异常，采用捕捉方式
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
