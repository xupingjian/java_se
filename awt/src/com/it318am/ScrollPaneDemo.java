package com.it318am;

import java.awt.*;

public class ScrollPaneDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("这里演示ScrollPane");

        ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);


        sp.add(new Button("这里是测试按钮"));
        sp.add(new TextField("这里是测试文本"));

        frame.add(sp);
//        frame.setBounds(100,100,500,300);
        frame.pack();
        frame.setVisible(true);

    }
}
