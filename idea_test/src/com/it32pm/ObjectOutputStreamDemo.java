package com.it32pm;

import java.io.*;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        write();
        read();

    }

    //对象反序列化
    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("idea_test\\\\osw2.txt"));
        Object obj = ois.readObject();
        Student s = (Student) obj;//向下转型
        System.out.println(s.getName() + "," + s.getAge());
        ois.close();
    }

    private static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("idea_test\\osw2.txt"));
        Student s = new Student("许平健", "30");
        oos.writeObject(s);//对象序列化}
        oos.close();
    }
}
