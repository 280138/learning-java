package com.itheima.abstract1;

public  abstract class A {  //抽象类：abstract修饰类

    //1、抽象类的特点：* 抽象类不能创建对象 *，仅作为一种特殊的父类，让子类继承并实现
    private String name;
    private int age;

    //2、抽象方法：1用abstract修饰，2没有方法体
    public abstract void show();
    public void show2(){
        System.out.println("show2方法");
    }

    public A() {
        System.out.println("无参构造方法");
    }
    public A(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
