package com.it32pm;

import java.io.*;

public class CopyJava {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("idea_test\\Copy.java"));
        PrintWriter pw = new PrintWriter(new FileWriter("idea_test\\copy2.java"),true);
        String line;
        while((line=br.readLine())!=null){
            pw.println(line);
        }
        pw.close();
        br.close();

    }


}
