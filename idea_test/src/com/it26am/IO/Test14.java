package com.it26am.IO;

import java.io.File;

public class Test14 {
    public static void main(String[] args) {
        //File[] listFiles()获取当前目录所有子文件
        File file = new File("D:\\韩顺平2021图解Linux课程【重磅升级】资料分享");
        File[] files = file.listFiles();
        for (File fileaa:files
             ) {
            System.out.println(fileaa.getAbsolutePath());
        }

    }
}
