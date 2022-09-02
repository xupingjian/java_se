package com.it318am;

import java.awt.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("这里测试flowlayout");
        //通过setLayout方法设置容器的布局管理器
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));//flowlayout流式布局管理器
        for (int i = 0; i < 100; i++) {
            frame.add(new Button("按钮" + i));

        }
        //设置最佳大小。pack方法
        frame.pack();
        frame.setVisible(true);
    }
}
