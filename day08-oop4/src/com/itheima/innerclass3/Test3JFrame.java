package com.itheima.innerclass3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3JFrame {
    public static void main(String[] args) {
        //目标：搞清楚几个匿名内部类使用场景
        //需求：创建一个登录窗口，窗口上只有一个登录按钮
        JFrame win = new JFrame("登录窗口");//桌子
        //调整桌子大小
        win.setSize(300,400);
        win.setLocationRelativeTo( null);//居中显示
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点叉关闭程序

        JPanel panel = new JPanel();
        win.add(panel);  //给桌子加桌布

        JButton btn = new JButton("登录");
        panel.add(btn);  //给桌布加按钮

        //java要求必须给按钮添加一个点击事件监听器对象，来监听用户的点击操作，就可以做出反应
        //开发中不是我们要主动去写匿名内部类，而是用别人功能的时候，别人可以让我们写一个匿名内部类，我们才会写
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击了登录按钮");
            }
        });



        win.setVisible(true);//桌子显示出来
    }
}

/*class ClickListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("点击了登录按钮");
    }
}*/
