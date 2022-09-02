package com.it318am;

import java.awt.*;

public class PanelDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("这里演示Panel");
//        frame.setLayout(new BorderLayout(30,5));
        Panel p = new Panel();
        p.add(new TextField("这里是一个测试文本"));
        p.add(new Button("这里是一个测试按钮"));
        frame.add(p);
        frame.setBounds(100,100,500,300);
        frame.setVisible(true);
    }
}
