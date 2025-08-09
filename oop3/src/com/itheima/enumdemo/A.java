package com.itheima.enumdemo;

public enum A {
    X,Y,Z;
}
/*
 * 枚举类反编译后的文件
 * public final class A extends java.lang.Enum<A>{
 *   public A(){}
 *
 *   public static final A X = new A();
 *   public static final A Y = new A();
 *   public static final A Z = new A();
 *
 *   public static A[] values(){}
 *   public static A valueOf(String name){}
 * }
 * 1、枚举类都是最终类final,不可以被继承，枚举类都是继承java.lang.Enum类
 * 2、枚举类的第一行只能罗列一些名称，这些名称都是常量（static修饰的静态变量），并且每个常量会记住枚举类的一个对象
 * 3、枚举类的构造器都是私有的
 */
