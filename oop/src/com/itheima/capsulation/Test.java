package com.itheima.capsulation;

public class Test {
    public static void main(String[] args) {
//创建对象时 TV tv = new TV("小米电视",true);左半边时定义一个TV类型，名叫tv的变量来接收，右半边是创建对象
        Student s1 = new Student("张三",22,80,90);
        System.out.println(s1.getName());
        s1.setName("王五");
        System.out.println(s1.getName());
    }
}
