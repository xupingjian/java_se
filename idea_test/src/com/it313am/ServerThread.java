package com.it313am;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket s;
    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        //接收数据写到文本文件
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//            BufferedWriter bw = new BufferedWriter(new BufferedWriter(new FileWriter("idea_test\\qwe.txt")));
            int count  =0;
            File file = new File("idea_test\\qwe["+count+"].txt");
            while(file.exists()){
                count++;
                file = new File("idea_test\\qwe["+count+"].txt");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            String line;
            while((line=br.readLine())!=null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            //给出反馈
            BufferedWriter bwserver = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwserver.write("上传成功");
            bwserver.newLine();
            bwserver.flush();

            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
