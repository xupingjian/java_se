package com.it28em;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class randomname {
    public static void main(String[] args) throws IOException {
        ArrayList<String> li = new ArrayList<>();
//        li.add("awtyjyetkeu,lie ,");
        BufferedReader br = new BufferedReader(new FileReader("idea_test\\array.txt"));
        String len;
        while((len=br.readLine())!=null){
            li.add(len);
        }
        br.close();
        Collections.shuffle(li);
        for(String s:li){
            System.out.println(s);
        }

    }
}
