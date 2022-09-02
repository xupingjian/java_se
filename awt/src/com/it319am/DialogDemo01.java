package com.it319am;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogDemo01 {
    public static void main(String[] args) {
        Frame frame = new Frame("这里测试Dialog");
        Dialog d1 = new Dialog(frame, "模式对话框", true);
//        Dialog d2 = new Dialog(frame, "非模式对话框", false);
        Box vBox = Box.createVerticalBox();
        vBox.add(new TextField());
        vBox.add(new Button("确认"));
        d1.add(vBox);
        d1.setBounds(20,30,300,200);
        Button b1 = new Button("打开模式对话框");
//        Button b2 = new Button("打开非模式对话框");

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d1.setVisible(true);
            }
        });

//        b2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                d2.setVisible(true);
//            }
//        });
        frame.add(b1,BorderLayout.NORTH);
//        frame.add(b2);
        frame.pack();
        frame.setVisible(true);

    }
}
