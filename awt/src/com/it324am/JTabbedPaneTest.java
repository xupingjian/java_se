package com.it324am;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JTabbedPaneTest {
    JFrame jFrame = new JFrame("测试JTabbedPane");
    JTabbedPane tabbedPane = new JTabbedPane(SwingConstants.BOTTOM,JTabbedPane.SCROLL_TAB_LAYOUT);

    public void init(){
        //组装视图
        //添加标签
        tabbedPane.addTab("用户管理",new JList<String>(new String[]{"用户1","用户2","用户3"}));
        tabbedPane.addTab("商品管理",new JList<String>(new String[]{"商品1","商品2","商品3"}));
        tabbedPane.addTab("订单管理",new JList<String>(new String[]{"订单1","订单2","订单3","订单4"}));
        //完成设置
        tabbedPane.setEnabledAt(2,false);
        tabbedPane.setSelectedIndex(1);

        //监听当前标签面板选中情况
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int selectedIndex = tabbedPane.getSelectedIndex();
                JOptionPane.showMessageDialog(jFrame,"选中了"+(selectedIndex)+"个标签");
            }
        });
        jFrame.add(tabbedPane);
        //设置窗口的位置和大小
        jFrame.setBounds(400,400,400,400);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    };

    public static void main(String[] args) {
        new JTabbedPaneTest().init();
    }
}
