package com.itheima.constructor;

public class Student {
    //认识构造器
    //构造器是一种 1名称是类名的 2无返回值类型 的 3特殊方法
    //构造器在创建对象时，会自动调用
    //重载：方法名称相同，形参列表不同

    String name;
    int age;
    char sex;
    //无参构造器
    public Student(){
        System.out.println("======无参构造器========");
    }

    //有参构造器
    public Student(String name){
        System.out.println("======有参构造器========");
        System.out.println("姓名："+name);
    }

    public Student(String name,int age,char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    //类自带了无参构造器
    //要么都不写(默认无参构造器)，要么都写（有参无参一起）
}
