package com.it26am.serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*参与序列化和反序列化的对象，必须实现Serializable接口*/
public class ObjectOutputStreamTest1 {
    public static void main(String[] args) throws IOException {
        Student s1 = new Student("zhangsam", 12);
        User u1 = new User(123, "lisi");
        /*一次序列化多个对象，将对象放到集合中，序列化集合*/
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(s1);
        objects.add(u1);
        ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("myObject"));
        obj.writeObject(objects);
        obj.flush();
        obj.close();

    }
}
