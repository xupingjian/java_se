package com.it318am;

import java.awt.*;

public class GrridLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("计算器");
        Panel p = new Panel();
        p.add(new TextField(30));//30指的是Textfiled的容量
        frame.add(p,BorderLayout.NORTH);
        Panel p2 =new Panel();
        p2.setLayout(new GridLayout(3,5,4,4));
        for (int i = 0; i < 10; i++) {
            p2.add(new Button(i+""));
        }
        p2.add(new Button("+"));
        p2.add(new Button("-"));
        p2.add(new Button("*"));
        p2.add(new Button("/"));
        p2.add(new Button("."));
        frame.add(p2);
        frame.pack();
        frame.setVisible(true);
    }
}
