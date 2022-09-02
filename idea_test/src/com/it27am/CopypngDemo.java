package com.it27am;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopypngDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\F413Y\\Pictures\\微信截图_20201204153727.png");
        FileOutputStream fos = new FileOutputStream("idea_test\\fos.png");
        byte[] bys = new byte[1024];
        int len;
        while((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }

        fis.close();
        fos.close();

    }
}
