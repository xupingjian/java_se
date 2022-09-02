package com.it22;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo02 {
    public static void main(String[] args) {
        ArrayList<Student> c = new ArrayList<>();

        Student s1 = new Student("张曼玉",24);
        Student s2 = new Student("王祖贤",18);
        Student s3 = new Student("林青霞",24);
        c.add(s1);
        c.add(s2);
        c.add(s3);
        Iterator<Student> it = c.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
