package com.it324am;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class JChioceDemo {
    //创建窗口对象
    JFrame jf = new JFrame("测试JFileChooser");
    //创建菜单条
    JMenuBar jmb = new JMenuBar();
    //创建菜单
    JMenu jMenu = new JMenu("文件");
    JMenuItem open = new JMenuItem(new AbstractAction("打开") {
        @Override
        public void actionPerformed(ActionEvent e) {
            //显示一个文件选择器
            JFileChooser filechooser = new JFileChooser(".");
            filechooser.showOpenDialog(jf);
            File file = filechooser.getSelectedFile();
            //进行显示
            try {
                image = ImageIO.read(file);
                drawArea.repaint();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    });
    JMenuItem save = new JMenuItem(new AbstractAction("另存为") {
        @Override
        public void actionPerformed(ActionEvent e) {
            //显示一个文件选择器
            JFileChooser filechooser = new JFileChooser(".");
            filechooser.showSaveDialog(jf);
            File file = filechooser.getSelectedFile();
            //进行显示
            try {
                ImageIO.write(image,"jpeg",file);
//                drawArea.repaint();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    });
    BufferedImage image;
    //Swing提供的组件，都使用了图像缓冲区技术
    private class MyCanvas extends JPanel{
        @Override
        public void paint(Graphics g) {
            //把图片绘制组件
            g.drawImage(image,0,0,null);
        }
    }
    MyCanvas drawArea = new MyCanvas();
    public void init(){
        //组装视图
        jMenu.add(open);
        jMenu.add(save);
        jmb.add(jMenu);
        jf.setJMenuBar(jmb);
        drawArea.setPreferredSize(new Dimension(740,500));
        jf.add(drawArea);

        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JChioceDemo().init();
    }
}
