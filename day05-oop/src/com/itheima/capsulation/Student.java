package com.itheima.capsulation;

public class Student {
    //private关键字（私有、隐藏）修饰成员变量
    //只能在本类访问，其他任何地方都不能访问
    private String name;
    private int age;
    private double chinese;
    private double math;

    //构造器：创建对象时自动调用
    public Student(){
    }
    public Student(String name,int age,double chinese,double math){
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
    }

    //用“共有方法”控制“私有属性”
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public  void printAllScore(){
        System.out.println(name + "的总成绩是" +(chinese + math));
    }

    public  void printAverageScore(){
        System.out.println(name + "的平均成绩是" +(chinese + math)/2);
    }
}
