package com.itheima.gui2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//自定义的登录界面：继承JFrame类
//让LoginFrame对象 既是窗口对象，也是监听器对象
public class LoginFrame extends JFrame implements ActionListener {
    public LoginFrame()
    {
        this.setTitle("登录界面");
        this.setSize(400,300);
        this.setLocationRelativeTo( null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //在这个构造函数中，this 指的是当前正在创建的对象实例
        // 也就是 LoginFrame 类的实例。此时this 也可以省略：
        init();
    }

    private void init() {
        JButton btn = new JButton("登录");
        btn.addActionListener(this);  //当前对象，即是窗口对象，也是监听器对象

        JPanel panel = new JPanel();
        this.add(panel);  //此处this与上同，代表当前实例对象

        panel.add(btn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this,"我被点击了");//this代表当前对象，即当前窗口对象
    }
}
