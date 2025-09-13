package com.itheima.abstract3;

public abstract class People {
    //模板方法设计模式
    //用final修饰模板方法，防止子类被重写
    public final void write(){
        System.out.println("\t\t\t《我的爸爸》");
        System.out.println("\t11111111");
        //每个子类写的信息是不同的
        writeMain();
        System.out.println("\t33333333");
    }

    //抽象方法：1用abstract修饰，2没有方法体
    public abstract  void writeMain();
}
