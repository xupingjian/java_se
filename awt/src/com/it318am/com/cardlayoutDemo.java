package com.it318am.com;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cardlayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame();
        //创建一个Panel，用来存储多张卡片
        Panel p = new Panel();
        //设置cardlayout
        CardLayout cardLayout = new CardLayout();
        p.setLayout(cardLayout);
        //往Panel中存储多个组件
        String[] names  ={"第一张","第二张","第三张","第四张","第五张"};
        for (int i = 0; i < names.length; i++) {
            p.add(names[i],new Button(names[i]));
        }
        //把panel放到frame的中间区域
        frame.add(p);
        //创建另一个panel P2 用来存储多个按钮组件
        Panel p2 = new Panel();
        //创建五个按钮组件
        Button b1 = new Button("上一张");
        Button b2 = new Button("下一张");
        Button b3 = new Button("第一张");
        Button b4 = new Button("最后一张");
        Button b5 = new Button("第三张");
        //创建一个事件监听器，监听按钮的点击动作
        ActionListener listener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();//获取按钮上的文字
                switch(actionCommand){
                    case"上一张":
                        cardLayout.previous(p);
                        break;
                    case"下一张":
                        cardLayout.next(p);
                        break;
                    case"第一张":
                        cardLayout.first(p);
                        break;
                    case"最后一张":
                        cardLayout.last(p);
                        break;
                    case"第三张":
                        cardLayout.show(p,"第三张");
                        break;
                }
            }
        };
        //把当前这个事件监听器和多个按钮绑定到一起
        b1.addActionListener(listener);
        b2.addActionListener(listener);
        b3.addActionListener(listener);
        b4.addActionListener(listener);
        b5.addActionListener(listener);
        //把按钮添加到容器p2中
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        //把P2放到frame的南边区域
        frame.add(p2,BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);



    }
}
