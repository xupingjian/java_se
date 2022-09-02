package com.set23;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getChinese() + o1.getMath() - o2.getChinese() -o1.getMath();
//                int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
                return num;
            }
        });
        Student s1 = new Student("a",88,78);
        Student s2 = new Student("b",78,68);
        Student s3 = new Student("c",98,88);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        for(Student s :ts){
            System.out.println(s.getName()+","+s.getChinese()+","+s.getMath());
        }



    }
}
