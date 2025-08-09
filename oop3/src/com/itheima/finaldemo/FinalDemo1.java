package com.itheima.finaldemo;

/*
    final关键字 ==> 最终
    修饰类：最终类不能被继承
    修饰方法：最终方法不能被重写
    修饰变量该变量有且仅能被赋值一次
*/
/*final修饰静态变量被称为 常量（名称全部大写，多个单词用下划线连接）*/
public class FinalDemo1 {
    public static void main(String[] args) {
        System.out.println(Constant.SCHOOL_NAME);
        System.out.println(Constant.SCHOOL_NAME);
        System.out.println(Constant.SCHOOL_NAME);
    }
}
