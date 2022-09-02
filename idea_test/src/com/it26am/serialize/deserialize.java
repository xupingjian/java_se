package com.it26am.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream mo = new ObjectInputStream(new FileInputStream("myObject"));
        Object o = mo.readObject();
        System.out.println(o);
        mo.close();
    }
}
