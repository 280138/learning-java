package com.itheima.Operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        //掌握基本算术运算符
        demo1();
        demo2();
    }
    public static void demo1(){
        int a = 10;
        int b = 3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);//3.3333==>3
        System.out.println((double)a/b);
        System.out.println(a%b);
    }

    //需求：研究+符号做连接符还是运算符
    public static void demo2(){
        String name = "张三";
        int age = 18;
        System.out.println("姓名：" + name + "，年龄：" + age);
        System.out.println(name + age);
        System.out.println(age + name);
        System.out.println(name + age + "岁");
    }
}
