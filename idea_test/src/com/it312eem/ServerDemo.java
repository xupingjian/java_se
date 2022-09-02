package com.it312eem;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(12312);
        Socket s = ss.accept();

        //获取输入流
//        InputStream is = s.getInputStream();
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));//等同与前三局
        //把数据写入文本文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("idea_test\\qwe.txt"));
        String line;
        while((line =br.readLine())!=null){
//            System.out.println(line);
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        ss.close();

    }
}
