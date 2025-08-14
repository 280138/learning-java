package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        //方式一（推荐）：用""创建字符串对象，封装字符串数据
        String s1 = "hello，黑马";
        System.out.println(s1.length());//处理字符串的方法
        //方式二(不推荐)：用构造器初始化对象
        String s2 = new String();
        System.out.println(s2);//空字符串
        String s3 = new String("hello，黑马");//不推荐
        char[] chs = {'h','e','l','l','o'};
        String s4 = new String(chs);
        System.out.println(s4);
        byte[] bytes = {97,98,99,100};
        String s5 = new String(bytes);
        System.out.println(s5);
        System.out.println("===========================================");
        //只有""给出的字符串对象放在字符串常量池，相同内容只放一个。
        String t1 = "abc";
        String t2 = "abc";
        System.out.println(t1 == t2);// true，打印的是地址

        String t3 = new String("abc");
        String t4 = new String("abc");
        System.out.println(t3 == t4);// false
        System.out.println("==============================================");
        //简易版的登录:
        String username = "admin";
        System.out.println("请输入用户名:");
        Scanner sc = new Scanner(System.in);
        String loginName = sc.next();

        //字符串对象内容比较，千万不要用==,==默认比较地址，字符串对象的内容一样时地址不一定一样
        //用String对象中的equals方法,比较字符串对象的内容
        if (username.equals(loginName)){
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
        System.out.println("================================================");
        System.out.println("请输入手机号：");
        //17720611211 ==> 177****1211
        String phone = sc.next();
        System.out.println("系统显示以下手机号进入：");
        String newPhone = phone.substring(0, 3) + "****" + phone.substring(7);
        System.out.println(newPhone);
    }
}

