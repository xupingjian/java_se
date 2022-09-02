package com.it312eeem;

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
//            if("886".equals(line)){
//                break;
//            }
            //获取输出流对象
//            OutputStream os = s.getOutputStream();
//            os.write(line.getBytes());
            bw.write(line);
            bw.newLine();
            bw.flush();

        }
        br.close();
        s.close();

    }
}
