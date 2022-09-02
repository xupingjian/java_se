package com.it31;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        method1();
        method2();
        method3();
        method4();
    }
    //jdk9改进方案
    private  static  void method4() throws IOException {
        FileReader fr = new FileReader("idea_test\\osw1.txt");
        FileWriter fw = new FileWriter("idea_test\\fw.txt");
        try(fr;fw){
            char[] chs = new char[1024];
            int len;
            while((len=fr.read())!=-1){
                fw.write(chs,0,len);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    //JDK7的改进方案
    private  static  void method3(){
        try(FileReader fr = new FileReader("idea_test\\osw1.txt");
            FileWriter fw = new FileWriter("idea_test\\fw.txt");){
            char[] chs = new char[1024];
            int len;
            while((len=fr.read())!=-1){
                fw.write(chs,0,len);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private static  void method2(){
        FileReader fr = null;
        FileWriter fw = null;
        try{
            fr = new FileReader("idea_test\\osw1.txt");
            fw = new FileWriter("idea_test\\fw.txt");
            char[] chs = new char[1024];
            int len;
            while ((len=fr.read())!=-1){
                fw.write(chs,0,len);

            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fw!=null){
                try{
                    fw.close();
                }catch(IOException e){
                    e.printStackTrace();
                }

            }
        }
    }
    private static void method1() throws IOException{
        FileReader fr = new FileReader("idea_test\\osw1.txt");
        FileWriter fw = new FileWriter("idea_test\\fw.txt");
        char[] chs = new char[1024];
        int len;
        while((len=fr.read())!=-1){
            fw.write(chs,0,len);
        }
        fw.close();
        fr.close();

    }

}
