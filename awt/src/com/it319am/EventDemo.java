package com.it319am;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo {
    Frame frame = new Frame("这里测试事件处理");
    TextField tf = new TextField();
    Button ok =new Button("确定");

    public void init(){
/*        MyListener myListener = new MyListener();
        ok.addActionListener(myListener);//这里通过内部类实现，也可以通过匿名内部类实现*/
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("确定按钮被按下");
                tf.setText("Hello World");
            }
        });
        frame.add(tf,BorderLayout.NORTH);
        frame.add(ok);
        frame.pack();
        frame.setVisible(true);
    }
    private class MyListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            tf.setText("HelloWorld");
        }
    }
    public static void main(String[] args) {
        new EventDemo().init();
    }
}
