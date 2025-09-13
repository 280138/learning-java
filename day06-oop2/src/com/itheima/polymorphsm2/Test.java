package com.itheima.polymorphsm2;

public class Test {
    public static void main(String[] args) {
//    多态的实现   通过   重写和向上转型（1继承2父类引用子类对象）
        Animals a = new Wolf();//第一种向上转型
        a.run();
        // a.shrinkHead();//报错：多态情况下不能调用子类独有功能
        System.out.println(a.name);// 动物     成员变量没有重写

        Wolf w = new Wolf();
        go(w);
        Tortoise t = new Tortoise();
        go(t);
    }
    public static void go(Animals a){//第二种向上转型  父类类型的变量作为形参，接子类对象
        System.out.println("开始。。。。");
        a.run();
    // a.shrinkHead();//报错：多态情况下不能调用子类独有功能

    }
}
