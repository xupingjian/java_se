package com.it312pm;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress address = InetAddress.getByName("DESKTOP-9ED79AF");
        InetAddress address = InetAddress.getByName("10.13.217.222");
        String ip = address.getHostAddress();
        String name = address.getHostName();
        System.out.println("主机名"+name);
        System.out.println("IP地址"+ip);

    }
}
