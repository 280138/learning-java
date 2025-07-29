package com.itheima.variable;
//目标：认识变量
public class VariableDemo1 {
    public static void main(String[] args) {
        printVariable();
    }
    //定义一个方法，来学习变量的定义
    public static void printVariable() {
        //定义一个变量  数据类型 变量名 = 值
        int a = 10;
        System.out.println(a);

        //定义一个小数变量，存储一个学生的Java成绩
        double score = 89.5;
        System.out.println(score);

        System.out.println("============");

        //研究变量特点
        int a2 = 24;
        a2 = 19;   //赋值
        System.out.println(a2);

        a2 = a2 + 1;
        System.out.println(a2);

        System.out.println("=============");
        //钱包目前有9.9，发出去5元，又收到6元，请实时输出钱包金额
        double money = 9.9;
        money = money - 5;
        System.out.println(money);
        money = money + 6;
        System.out.println(money);

        System.out.println("=============");
        char ch = 'a'; // a = 97
        System.out.println(ch + 1);
        char ch2 = 'A';//A = 65
        System.out.println(ch2 + 1);

        //二进制，八进制，十二进制
        System.out.println("=============");
        int i1 = 0b01100001;//二进制  以0b开头
        System.out.println(i1);
        int i2 = 0141;//八进制  以0开头
        System.out.println(i2);
        int i3 = 0x41;//十六进制  以0x开头
        System.out.println(i3);
    }
}
