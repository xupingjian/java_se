package com.it325am;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JProgressTest {
    JFrame jf = new JFrame("测试进度条");
    JCheckBox indeterminate = new JCheckBox("不确定进度");
    JCheckBox noBorder = new JCheckBox("不绘制边框");
    //创建进度条
    JProgressBar bar = new JProgressBar(JProgressBar.HORIZONTAL,0,100);
    public void init() throws InterruptedException {
        //组装试图

        //处理复选框的点击行为
        indeterminate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取indeterminate复选框有没有被选中
                boolean selected = indeterminate.isSelected();
                //设置当前进度条不确定进度
                bar.setIndeterminate(selected);
                //不显示具体百分比
                bar.setStringPainted(!selected);
            }
        });
        noBorder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取 noBorder复选框有没有被选中
                boolean selected =  noBorder.isSelected();
                //不显示边框
                bar.setBorderPainted(!selected);
            }
        });

        Box vBox = Box.createVerticalBox();
        vBox.add(indeterminate);
        vBox.add(noBorder);
        //设置进度条属性
        bar.setStringPainted(true);
        bar.setBorderPainted(true);
        //把当前窗口的布局方式修改为FlowLayout
        jf.setLayout(new FlowLayout());
        jf.add(vBox);
        jf.add(bar);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
        //模拟进度条进度
        for (int i = 0; i < 100; i++) {
            //修改已经完成的工作量，也就是百分比
            bar.setValue(i);
            Thread.sleep(500);
        }
    };

    public static void main(String[] args) throws InterruptedException {
        new JProgressTest().init();
    }
}
