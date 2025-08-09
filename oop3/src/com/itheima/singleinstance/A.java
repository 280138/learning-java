package com.itheima.singleinstance;
//饿汉式单例
public class A {
    //1、构造方法私有化
    private A(){
    }
    //2、饿汉式：提前创建唯一的实例
    private static  final A a = new A();
    //3、提供获取实例的方法
    public static A getInstance(){
        return a;
    }
}
