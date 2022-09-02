package com.it319pm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListenerDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("这里测试监听器");
        //创建组件（事件源）
        TextField tf = new TextField(30);
        Choice names = new Choice();
        names.add("柳岩");
        names.add("舒淇");
        names.add("袁丽");
        //事件处理
        //给文本域添加TextListener,监听内容的变化
        tf.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                String text = tf.getText();
                System.out.println(tf);
            }
        });
        //给下拉选择框添加ItemListener,监听条目的变化
        names.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Object item = e.getItem();
                System.out.println(item);
            }
        });
        //给frame注册ContainerListener监听器,监听容器中的组件的添加
        frame.addContainerListener(new ContainerListener(){
            @Override
            public void componentAdded(ContainerEvent e) {
                Component child = e.getChild();
                System.out.println(child);
            }

            @Override
            public void componentRemoved(ContainerEvent e) {

            }
        });


        Box hBox = Box.createHorizontalBox();
        hBox.add(names);
        hBox.add(tf);

        frame.add(hBox);
        frame.pack();
        frame.setVisible(true);

    }
}
