package com.it312eeemfq;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("10.13.217.222",12312);
        //封装文本文件的数据
        BufferedReader br = new BufferedReader(new FileReader("idea_test\\Copy.java"));
        //封装输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while((line = br.readLine())!=null){

            //获取输出流对象
//            OutputStream os = s.getOutputStream();
//            os.write(line.getBytes());
            bw.write(line);
            bw.newLine();
            bw.flush();

        }
//        System.out.println(1111);
        s.shutdownOutput();
        //接收反馈
        BufferedReader brclient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brclient.readLine();//等待读取数据
        System.out.println("服务器的反馈："+data);
        //释放资源
        br.close();
        s.close();

    }
}