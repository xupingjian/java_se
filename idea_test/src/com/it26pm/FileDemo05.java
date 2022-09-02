package com.it26pm;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo05 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("idea_test\\fos2.txt",true);
        for(int i= 0;i<10;i++){
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());

        }
        fos.close();

    }
}
