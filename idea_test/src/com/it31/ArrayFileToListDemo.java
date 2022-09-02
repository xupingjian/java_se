package com.it31;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayFileToListDemo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("idea_test\\array1.txt"));
        ArrayList<Student> list = new ArrayList<>();
        String len;
        while((len=br.readLine())!=null){
            Student st = new Student();
            String[] strArray = len.split(",");
            st.setSid(strArray[0]);
            st.setName(strArray[1]);
            st.setAge(Integer.parseInt(strArray[2]));
            st.setAddress(strArray[3]);
            list.add(st);

        }
        br.close();
        for(Student s:list){
            System.out.println(s.getSid()+","+s.getName()+","+s.getAge()+","+s.getAddress());
        }

    }
}
