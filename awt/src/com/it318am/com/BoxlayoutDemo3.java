package com.it318am.com;

import javax.swing.*;
import java.awt.*;

public class BoxlayoutDemo3 {
    public static void main(String[] args) {
        Frame frame = new Frame("这里测试Boxlayout");

        Box hBox = Box.createHorizontalBox();
        hBox.add(new Button("水平按钮1"));
        hBox.add(Box.createHorizontalGlue());//该分割在两个方向上都可以拉伸
        hBox.add(new Button("水平按钮2"));
        hBox.add(Box.createHorizontalStrut(30));
        hBox.add(new Button("水平按钮3"));

        Box vBox = Box.createVerticalBox();
        vBox.add(new Button("垂直按钮1"));
        vBox.add(Box.createVerticalGlue());//该分割在两个方向上都可以拉伸
        vBox.add(new Button("垂直按钮2"));
        vBox.add(Box.createVerticalStrut(30));
        vBox.add(new Button("垂直按钮3"));
        frame.add(hBox,BorderLayout.NORTH);
        frame.add(vBox);
        frame.pack();
        frame.setVisible(true);
    }
}
