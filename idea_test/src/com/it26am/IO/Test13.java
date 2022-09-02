package com.it26am.IO;

import java.io.File;
import java.io.IOException;

public class Test13 {
    public static void main(String[] args) throws IOException {
        File f = new File("file\\fgsajg");
        boolean exists = f.exists();
        System.out.println(exists);//判断是否存在file文件
        if(!f.exists()){
            f.mkdirs();
            System.out.println(f.getParent());
        }
    }
}
