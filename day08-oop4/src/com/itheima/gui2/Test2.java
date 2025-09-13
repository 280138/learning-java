package com.itheima.gui2;

import javax.swing.*;

public class Test2 {
    //事件的几种常用写法：
    //1、直接提供实现类，用于创建事件监听器对象
    //2、直接使用匿名内部类对象，代表事件监听器对象
    //3、自定义窗口，让窗口对象实现事件接口（自定义一个类，作窗口）-------- √
    public static void main(String[] args) {
//        JFrame jf = new JFrame("第一个窗口");  原本操作窗口的代码
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
    }
}
