package com.it26am.IO;

import java.io.*;

public class CopyTest {
    public static void main(String[] args) {
        File srcFile = new File("D:\\BaiduNetdiskDownload\\source");//源文件
        File destFile = new File("E:\\");//目标文件

        copyDir(srcFile, destFile);
    }

    private static void copyDir(File srcFile, File destFile) {
        if (srcFile.isFile()) {
            //是文件，执行一边读一遍写的操作
            FileInputStream fis = null;
            FileOutputStream fos = null;
            try {
                fis = new FileInputStream(srcFile);
                fos = new FileOutputStream((destFile.getAbsolutePath().endsWith("//") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "//") + srcFile.getAbsolutePath().substring(3));
                byte[] bytes = new byte[1024 * 1024];
                int readCount = 0;
                while ((readCount = fis.read(bytes)) != -1) {
                    fos.write(bytes, 0, readCount);
                }
                return;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        } else {
            File[] files = srcFile.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    String srcdir = file.getAbsolutePath();
                    String destDir = (destFile.getAbsolutePath().endsWith("//") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "//") + srcdir.substring(3);
                    File file1 = new File(destDir);
//                    System.out.println(file1);
                    if (!file1.exists()) {
                        file1.mkdirs();
                    }
                }
                copyDir(file, destFile);
            }
        }
    }
}
