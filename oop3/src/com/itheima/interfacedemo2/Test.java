package com.itheima.interfacedemo2;

import java.util.Scanner;

public class Test {
    //目标：面向对象编程实现智能家居控制系统
    public static void main(String[] args) {
        //1、定义设备类
        //2、定义数组，存储数据对象
        JD[] jds = new JD[4];//用父类对象存（多态）
        //创建对象时 TV tv = new TV("小米电视",true);左半边是定义一个TV类型名叫tv的变量来接收，右半边是创建对象
        jds[0] = new TV("小米电视",true);
        jds[1] = new WashMachine("美的洗衣机",false);
        jds[2] = new Lamp("路灯",true);
        jds[3] = new Air("美的空调",false);
        //3、定义一个接口，实现开关的功能，让父类JD实现，这样子类都能够实现
        //4、-----创建控制系统对象，实现开和关的控制功能(把全部对象连起来)------***
        SmartHomeControl smartHomeControl = new SmartHomeControl();
        //5、控制电视机
        //smartHomeControl.control(jds[0]);

        //6、提示用户操作：a、展示全部设备当前情况 b、让用户选择一个操作
        while (true) {
            smartHomeControl.printAllStatus(jds);
            System.out.println("请输入您要操作的设备编号：");
            Scanner sc = new Scanner(System.in);
            String command = sc.next();
            switch(command){
                case "1":
                    smartHomeControl.control(jds[0]);
                    break;
                case "2":
                    smartHomeControl.control(jds[1]);
                    break;
                case "3":
                    smartHomeControl.control(jds[2]);
                    break;
                case "4":
                    smartHomeControl.control(jds[3]);
                    break;
                case "exit":
                    System.out.println("已退出系统！");
                    return;
                default:
                    System.out.println("输入错误！请重新输入：");
            }
        }
    }
}
