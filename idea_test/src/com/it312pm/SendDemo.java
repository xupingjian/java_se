package com.it312pm;

import java.io.IOException;
import java.net.*;

/*UDP发送数据的步骤
* 1.创建发送端的Socket对象（DatagramSocket)
* 2.创建数据，并把数据打包
* 3.调用DatagramSocket对象的方法发送数据
* 4.关闭发送端*/
public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        //创建数据，并把数据打包
        //Datagrampacket(byte[] buf.int length,InetAddress address,int port)
        //构建一个数据包，发送长度为length的数据包到指定主机上的端口号
        byte[] bys = "hello,udp,我来了".getBytes();
/*        int length = bys.length;
        InetAddress address = InetAddress.getByName("10.13.217.222");
        int port = 10086*/;
        DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("10.13.217.222"),10086 );
        ds.send(dp);
        ds.close();

    }
}
