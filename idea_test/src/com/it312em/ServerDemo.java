package com.it312em;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*TCP接收数据的步骤
* 1:创建服务器的Socket对象（ServerSocket)
* 2:监听客户端连接，返回一个Socket对象
* 3：获取输入流，读数据，并把数据显示在控制台
* 4：释放资源*/
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(12312);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("数据是："+data);

        s.close();
        s.close();
    }
}
