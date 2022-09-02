package com.it320am;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PinBall {
    //创建窗口对象
    private Frame frame = new Frame("弹珠游戏");
    //桌面高度和高度
    private final int TABLE_WIDTH = 300;
    private final int TABLE_HEIGHT = 400;
    //球拍的高度和宽度
    private final int RACKET_WIDTH = 60;
    private final int RACKET_HEIGHT =20;
    //小球的大小
    private final int BALL_SIZE = 16;
    //定义变量，记录小球的坐标
    private int ballX = 120;
    private int bally = 20;
    //定义变量，记录小球在x和y方向上的分别移动的速度
    private int speedx=10;
    private int speedy =5;
    //定义变量，记录球拍的坐标
    private int racketx =120;
    private  final int rackety=340;
    //定义变量，标识当前游戏是否已结束
    private  boolean isOver=false;
    //声明一个定时器
    private Timer timer;
    //自定义一个类，继承canvas,充当画布
    private class MyCanvas extends java.awt.Canvas{
        @Override
        public void paint(Graphics g) {
            //在这绘制内容
            if(isOver){
                //游戏结束
                g.setColor(Color.BLUE);
                g.setFont(new Font("Times",Font.BOLD,30));
                g.drawString("游戏结束！",50,200);
            }else{
                //游戏中
                //绘制小球
                g.setColor(Color.RED);
                g.fillOval(ballX,bally,BALL_SIZE,BALL_SIZE);
                //绘制球拍
                g.setColor(Color.PINK);
                g.fillRect(racketx,rackety,RACKET_WIDTH,RACKET_HEIGHT);
            }
        }
    }
    //创建绘画区域
    MyCanvas drawArea = new MyCanvas();

    public void init(){
        //组装视图，游戏逻辑的控制
        //完成球拍坐标的变化
        KeyListener listener = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //获取当前按下的健
                int keyCode = e.getKeyCode();
                if(keyCode==KeyEvent.VK_LEFT){
                    if(racketx>0){
                        racketx-=10;
                    }
                }
                if(keyCode==KeyEvent.VK_RIGHT){
                    if(racketx<(TABLE_WIDTH-RACKET_WIDTH)){
                        racketx+=10;
                    }
                }
            }
        };
        //给Frame和drawArea注册监听器
        frame.addKeyListener(listener);
        drawArea.addKeyListener(listener);
        //小球坐标的控制

        ActionListener task = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //根据边界范围，修正速度
                if(ballX<=0||ballX>=(TABLE_WIDTH-BALL_SIZE)){
                    speedx = -speedx;
                }
                if(bally<=0||(bally>rackety-BALL_SIZE && ballX>racketx&& ballX<racketx+RACKET_WIDTH)){
                    speedy=-speedy;
                }
                if(bally>rackety-BALL_SIZE && (ballX<racketx||ballX>racketx+RACKET_WIDTH)){
                    //小球超出球拍范围，游戏结束
                    //停止定时器
                    timer.stop();
                    isOver=true;
                    //重绘界面
                    drawArea.repaint();
                }
                //更新小球的坐标，重绘界面
                ballX+=speedx;
                bally+=speedy;
                //重绘界面
                drawArea.repaint();
            }
        };
        timer=new Timer(100,task);
        timer.start();
        drawArea.setPreferredSize(new Dimension(TABLE_WIDTH,TABLE_HEIGHT));
        frame.add(drawArea);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new PinBall().init();
    }
}
