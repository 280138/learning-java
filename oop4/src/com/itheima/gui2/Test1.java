package com.itheima.gui2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test1 {
    public static void main(String[] args) {
        //事件的几种常用写法：
        //1、直接提供实现类，用于创建事件监听器对象 ----------- √
        //2、直接使用匿名内部类对象，代表事件监听器对象
        //3、自定义窗口，让窗口对象实现事件接口（自定义一个类，作窗口）
        JFrame jf = new JFrame("第一个窗口");

        JPanel panel = new JPanel();
        jf.add(panel);

        jf.setSize(300,400);//设置窗口大小
        jf.setLocationRelativeTo( null);//居中显示
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点叉关闭程序

        JButton jb = new JButton("登录");
        panel.add(jb);

        jb.addActionListener(new MyActionListener(jf));

        jf.setVisible(true);
    }
}

class MyActionListener implements ActionListener{
    private JFrame jf;
    public MyActionListener(JFrame jf){
        this.jf = jf;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
//        JOptionPane.showMessageDialog(jf,"有人点击了登录");   //如何把窗口对象jf传递给JOptionPane.showMessageDialog()方法呢?
        JOptionPane.showMessageDialog(jf,"有人点击了登录");
    }
}
