package com.it31;

import java.io.*;

public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        File srcFolder = new File("D:\\itcast");
        String srcFolderName = srcFolder.getName();

        File destFolder = new File("idea_test", srcFolderName);
        if(!destFolder.exists()){
            destFolder.mkdir();
        }
        File[] list = srcFolder.listFiles();
        for(File f:list){
//            BufferedReader bufferedReader = new BufferedReader(new FileInputStream(f));
            String srcFileName = f.getName();
            File destFile = new File(destFolder, srcFileName);
            copyFile(f,destFile);
        }

    }
    private static void copyFile(File srcFile,File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        int len;
        while((len=bis.read())!=-1){
            bos.write(len);

        }
        bos.close();
    }

}
