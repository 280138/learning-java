package com.itheima.object.Operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        //需求：理解自增自减运算符
        demo1();
        demo2();
    }

    public static void demo1() {
        int a = 10;
        int b = a++;//先用再加
        System.out.println(a);
        System.out.println(b);
    }

    public static void demo2() {
        int a = 10;
        int b = ++a;//先加再用
        System.out.println(a);
        System.out.println(b);
    }
}
