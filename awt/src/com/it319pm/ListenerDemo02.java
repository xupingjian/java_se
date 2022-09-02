package com.it319pm;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ListenerDemo02 {
    public static void main(String[] args) {
        Frame frame = new Frame("这里测试windowListener");
        frame.setBounds(200,200,500,300);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }
}
