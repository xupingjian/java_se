package com.it26am.IO;

import java.io.FileNotFoundException;

public class Test12 {
    public static void main(String[] args) {
        Mylog mg = new Mylog();
        try {
            mg.log("登录隐含的密码");
            mg.log("自己写的记录日志程序");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
