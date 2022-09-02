package com.it312pm;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*UDP接受数据的步骤
* 1.创建接收端的Socket对象（DatagramSocket)
* 2.创建一个数据包，用于接受数据
* 3,调用DatagramSocket对象的方法接受的数据
* 4.解析数据包，并把数据在控制它显示
* 5.关闭接收端*/
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys,bys.length);
        ds.receive(dp);
        byte[] datas = dp.getData();
        int len  = dp.getLength();
        String dataString = new String(datas,0,len);
        System.out.println(dataString);
        ds.close();
    }
}
