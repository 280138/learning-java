package com.itheima.polymorphsm1;

public class Test {
    public static void main(String[] args) {
        //    多态   通过   重写和向上转型（1继承2父类引用子类对象）
        //向上转型==>属性和方法丢失==>只能调用父类中的方法和属性
        //重写==>能调用子类方法

        Animals a = new Wolf();//“重点***”
        a.run();
        System.out.println(a.name);//成员变量：编译和运行都看左边

        Animals b = new Tortoise();
        b.run();
        System.out.println(b.name);
    }
}
