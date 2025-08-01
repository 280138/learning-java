package com.itheima.Operator;

import java.util.Scanner;

public class OperatorDemo4 {
    public static void main(String[] args) {
        //目标：三元运算符
        demo1();
    }
    public static void demo1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数：");
        int b = sc.nextInt();
        int max = a > b ? a : b;
        System.out.println(max);
    }
}
