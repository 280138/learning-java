package com.itheima.scanner;

import java.util.Scanner;//导包

public class ScannerDemo1 {
    //需求：我是一个零基础小白，请写一个程序，可以让用户键盘输入用户名和年龄，然后打印出来
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入用户名：");
        //获取用户输入后，直到按了回车键再往下走
        String name = sc.next();
        System.out.println("请输入年龄：");
        //获取用户输入后，直到按了回车键再往下走
        int age = sc.nextInt();
        System.out.println("用户名：" + name + "，年龄：" + age);
    }
}
