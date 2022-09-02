package com.it318am;

import java.awt.*;

public class BoarderLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("这里测试BoarderLayout");
        frame.setLayout(new BorderLayout(30,5));
        frame.add(new Button("东侧按钮"),BorderLayout.EAST);
        frame.add(new Button("西侧按钮"),BorderLayout.WEST);
        frame.add(new Button("南侧按钮"),BorderLayout.SOUTH);
        frame.add(new Button("北侧按钮"),BorderLayout.NORTH);
        frame.add(new Button("中间按钮"),BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
