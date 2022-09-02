package com.it318am.com;


//Boxlayout是在swing包下的
import javax.swing.*;
import java.awt.*;

public class BoxlayoutDemo1 {
    public static void main(String[] args) {
        Frame frame = new Frame("这里测试Boxlayout");
        BoxLayout boxLayout = new BoxLayout(frame,BoxLayout.X_AXIS);
        frame.setLayout(boxLayout);
        frame.add(new Button("按钮1"));
        frame.add(new Button("按钮2"));
        frame.pack();
        frame.setVisible(true);
    }
}
