package com.it28em;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//这里从集合到文本
//也可以从文本到集合

public class ArrayListToTxtDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> li = new ArrayList<>();
        li.add("awtyjyetkeu,lie ,");
        BufferedWriter br = new BufferedWriter(new FileWriter("idea_test\\array.txt"));
        for(String s:li){
            br.write(s);
            br.newLine();
            br.flush();
        }
        br.close();
    }
}
