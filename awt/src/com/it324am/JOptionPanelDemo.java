package com.it324am;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class JOptionPanelDemo {
    JFrame jf = new JFrame("测试消息对话框");
    JTextArea jta = new JTextArea(6,30);
    //声明按钮
    JButton btn= new JButton(new AbstractAction("弹出消息对话框") {
        @Override
        public void actionPerformed(ActionEvent e) {
            //弹出一个消息对话框
            String text = jta.getText();
            //参数：int messageType 指定消息对话框的类型：（ERROR_MESSAGE,WARING_MESSAGE.........）,也可以自定义对话框
            JOptionPane.showMessageDialog(jf,text,"消息对话框",JOptionPane.ERROR_MESSAGE);
//            JOptionPane.showMessageDialog(jf,text,"消息对话框",JOptionPane.ERROR_MESSAGE,new ImageIcon("D:\\develop\\JavaSE_Code\\idea_test\\fos.png"));
        }
    });

    public void init(){
        //组装试图
        jf.add(jta);
        jf.add(btn, BorderLayout.SOUTH);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
    }
    public static void main(String[] args) {

        new JOptionPanelDemo().init();
    }
}
