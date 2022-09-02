package com.it312em;
/*
* Tcp发送数据的步骤
* 1.创建客户端的Socket对象（Socket)
* 2.获取输出流，写数据
* 3.释放资源*/
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
//1.创建客户端的Socket对象（Socket)
//        Socket s = new Socket(InetAddress.getByName("10.13.217.222"), 10000);
        Socket s = new Socket("10.13.217.222", 12312);

        //获取输出流，写数据
        OutputStream os = s.getOutputStream();
        os.write("sgg,nigh方式".getBytes());
        s.close();


    }
}
