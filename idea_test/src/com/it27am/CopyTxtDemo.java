package com.it27am;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTxtDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("idea_test\\fos2.txt");
        FileOutputStream fos = new FileOutputStream("idea_test\\fos.txt");
        int by;
        while((by=fis.read())!=-1){
            fos.write(by);
        }
        fos.close();
        fis.close();
    }
}
