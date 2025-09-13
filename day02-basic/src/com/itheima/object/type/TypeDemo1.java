package com.itheima.object.type;

public class TypeDemo1 {
    public static void main(String[] args) {
        //目标：认识自动类型转换，强制类型转换
        byte b = 10;
        print(b);
        print2(b);

        System.out.println("----------");
        int a = 10;
        //强制类型转换,语法：类型 变量名 = (类型)变量名;
        byte j = (byte)a;
        print3(j);

        System.out.println("----------");
        int m = 1500;
        byte n = (byte)m;
        print3(n);//出现数据溢出

        System.out.println("----------");
        double d = 4.29;
        int i = (int)d;
        print(i);//浮点型转整数，直接去掉小数部分
    }

    public static void print(int a) {
        System.out.println(a);
    }

    public static void print2(double a) {
        System.out.println(a);
    }

    public static void print3(byte a) {
        System.out.println(a);
    }
}
