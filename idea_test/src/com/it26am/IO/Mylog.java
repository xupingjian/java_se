package com.it26am.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mylog {
    public void log(String s) throws FileNotFoundException {
        PrintStream my = new PrintStream(new FileOutputStream("mylog",true));
        System.setOut(my);
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String f = sdf.format(date);
        System.out.println(f+":"+s);
    }
}
