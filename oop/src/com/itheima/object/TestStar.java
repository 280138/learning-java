package com.itheima.object;

public class TestStar {
    public static void main(String[] args) {
        //创建对象
        //语法：类名 对象名 = new 类名();
//创建对象时 TV tv = new TV("小米电视",true)
// 左半边是定义一个TV类型名叫tv的变量来接收，右半边是创建对象
        Star s1 = new Star();
        s1.name = "王祖贤";
        s1.age = 30;
        s1.height = 1.68;
        s1.weight = 50.5;
        System.out.println(s1.name + " " + s1.age + " " + s1.height + " " + s1.weight);

        Star s2 = new Star();
        s2.name = "张三";
        s2.age = 18;
        s2.height = 1.68;
        s2.weight = 50.5;
        System.out.println(s2.name + " " + s2.age + " " + s2.height + " " + s2.weight);
    }
}
