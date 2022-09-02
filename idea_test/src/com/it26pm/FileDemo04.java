package com.it26pm;

import java.io.File;

public class FileDemo04 {
    public static void main(String[] args) {
        //创建一个File对象
        File f = new File("idea_test\\java.txt");
        //public boolean isDirectory():测试此对象路径名表示的File是否为目录
        //public boolean isFlie():测试此对象路径名表示的File是否为文件
        //public boolean exists():测试此对象路径名表示的File是否为存在
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.exists());
        //public String getAbsolutePath():返回此抽象路径名的绝对路径
        //public String getPath() 将此抽象路径名转换为路径名字符串
        //public String getName() 返回由此抽象路径名表示的文件或目录的名称
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getPath());
        System.out.println(f.getName());

        //public String[] list():返回此抽象路径表示的目录中的文件和目录的名称字符串数组
        //public File[] listFiles():返回此抽象路径名表示的文件和目录的File对象数组
        File f2 = new File("D:\\itcast");
        String[] strArray = f2.list();
        for(String s:strArray){
            System.out.println(s);
        }
        File[] fileArray = f2.listFiles();
        for(File f1:fileArray){
            System.out.println(f1);
        }

    }
}
