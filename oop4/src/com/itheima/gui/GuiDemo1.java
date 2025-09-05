package com.itheima.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GuiDemo1 {
    public static void main(String[] args) {
        //目标：快速入门GUI Swing的编程
        //创建一个窗口
        JFrame jf = new JFrame("第一个窗口");

        JPanel panel = new JPanel();
        jf.add(panel);

        jf.setSize(300,400);//设置窗口大小
        jf.setLocationRelativeTo( null);//居中显示
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点叉关闭程序

        JButton jb = new JButton("登录");
        panel.add(jb);

        //给按钮增加点击事件监听器对象
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("点击了登录按钮");
                JOptionPane.showMessageDialog(jf,"有人点击了登录");
            }
        });

        //需求:监听用户键盘上下左右四个按钮的事件
        //给jf增加按键监听器对象
        // 给jf增加按键监听器对象
        jf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("按下了按键");
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        System.out.println("向上");
                        break;
                    case KeyEvent.VK_DOWN:
                        System.out.println("向下");
                        break;
                    case KeyEvent.VK_LEFT:
                        System.out.println("向左");
                        break;
                    case KeyEvent.VK_RIGHT:
                        System.out.println("向右");
                        break;
                }
            }
        });

        jf.setVisible(true);
        jf.requestFocus();//让窗口成为焦点
    }
}
