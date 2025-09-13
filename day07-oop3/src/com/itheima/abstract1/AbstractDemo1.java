package com.itheima.abstract1;

public class AbstractDemo1 {
    //抽象类中不一定要有抽象方法，有抽象方法的类必是抽象类（abstract）
    //抽象类的特点：* 抽象类不能创建对象 *，仅作为一种特殊的父类，让子类继承并实现
    //抽象方法：1用abstract修饰，2没有方法体
//     A a = new A();//报错
    public static void main(String[] args) {
        B b = new B();
        b.setName("张三");
        b.show();
        b.show2();
    }
}
