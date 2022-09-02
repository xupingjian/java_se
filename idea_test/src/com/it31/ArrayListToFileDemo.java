package com.it31;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToFileDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> st = new ArrayList<>();
        Student s1 = new Student("it01","黄宇",21,"泥河");
        Student s2 = new Student("it02","许平健",27,"泥河");
        Student s3 = new Student("it03","妈妈",48,"泥河");
        st.add(s1);
        st.add(s2);
        st.add(s3);
        BufferedWriter bw = new BufferedWriter(new FileWriter("idea_test\\array1.txt"));
        for(Student se:st){
//            String str = (se.getSid()+","+se.getName()+","+se.getAge()+","+se.getAddress());
            StringBuilder str = new StringBuilder();
            str.append(se.getSid()).append(",").append(se.getName()).append(",").append(se.getAge()).append(",").append(se.getAddress());
            bw.write(str.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
