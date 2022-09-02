package com.it313am;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(12312);
        while(true) {
            Socket s = ss.accept();
            new Thread(new ServerThread(s)).start();
        }


    }
}
