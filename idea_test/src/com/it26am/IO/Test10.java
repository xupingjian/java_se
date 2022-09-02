package com.it26am.IO;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*java.io.DataOutputStresm：数据专属流
* 这个流可以将数据连同数据的类型一并写入文件。（这个文件不是不同的文本文档，记事本打不开）*/
public class Test10 {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("java2"));
        int i = 1;
        byte b = 01;
        short s = 2;
        long l = 1234L;
        float f = 3.1235f;
        double d = 2133245234;
        char c = 'd';
        dos.writeInt(i);
        dos.writeDouble(d);
        dos.writeShort(s);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeChar(c);
        dos.flush();
    }
}
