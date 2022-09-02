package com.it320am;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopupMenuTest {
    private Frame frame =new Frame("这里测试PopupMenu");
    //创文本域
    TextArea ta = new TextArea("我爱中华",6,40);
    //创建Panel容器
    Panel p =new Panel();
    //创建PopupMenu
    PopupMenu popupMenu = new PopupMenu();

    //创建菜单项
    MenuItem comment = new MenuItem("注释");
    MenuItem cancelcomment = new MenuItem("取消注释");
    MenuItem copy = new MenuItem("复制");
    MenuItem save = new MenuItem("保存");

    public void init(){
        //组装试图
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();
                ta.append("您点击了："+actionCommand+"\n");
            }
        };
        comment.addActionListener(listener);
        cancelcomment.addActionListener(listener);
        copy.addActionListener(listener);
        save.addActionListener(listener);
        popupMenu.add(comment);
        popupMenu.add(cancelcomment);
        popupMenu.add(copy);
        popupMenu.add(save);
        p.add(popupMenu);
        p.setPreferredSize(new Dimension(400,300));
        //给Panel注册鼠标事件，监听用户释放鼠标的动作，展示菜单
        p.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                boolean flag = e.isPopupTrigger();//辨别是否右键，若右键，则为true
                if(flag){
                    //显示PopupMenu
                    popupMenu.show(p,e.getX(),e.getY());
                }
            }
        });
        frame.add(ta);
        frame.add(p,BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new PopupMenuTest().init();
    }
}
