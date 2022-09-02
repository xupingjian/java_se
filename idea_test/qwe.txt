package com.it28em;

import java.io.*;

public class BufferWriter {
    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter("idea_test\\osw1.txt"));
//        //写数据
//        for (int i = 0; i < 10; i++) {
//            bw.write("hello" + i);
////            bw.write("\r\n");
//            bw.newLine();
//            bw.flush();
//        }
        BufferedReader br = new BufferedReader(new FileReader("idea_test\\osw1.txt"));
//        System.out.println(br.readLine());
//        System.out.println(br.readLine());
        String line;
        while((line = br.readLine())!=null){
            System.out.print(line);
        }
        br.close();


//        bw.close();
    }
}
