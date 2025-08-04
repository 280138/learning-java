package com.itheima.object.method;

public class MethodDemo2 {
    public static void main(String[] args) {
        //目标：认识方法的重载
        //方法重载：方法名称相同，形参列表不同（类型、个数、顺序不同）
        print(10);
        print("hello world");
        print(10.1);
    }

    public static void print(int a){
        System.out.println(a);
    }

    public static void print(String str){
        System.out.println(str);
    }

    public static void print(double d){
        System.out.println(d);
    }
}
