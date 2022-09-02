package com.it324am;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class InputDialogTest {
    JFrame jf = new JFrame("测试输入对话框");
    JTextArea jta = new JTextArea(6,30);
    //声明按钮
    JButton btn= new JButton(new AbstractAction("弹出输入对话框") {
        @Override
        public void actionPerformed(ActionEvent e) {
          //弹出输入对话框
            String s = JOptionPane.showInputDialog(jf, "请填写星系", "输入对话框", JOptionPane.INFORMATION_MESSAGE);
            jta.append(s);
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

        new InputDialogTest().init();
    }
}
