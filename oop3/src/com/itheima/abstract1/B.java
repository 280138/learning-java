package com.itheima.abstract1;

public class B extends A{
    //一个类继承抽象类，必须重写完继承的全部抽象方法，否则这个类也必须定义成抽象类
    @Override
    public void show() {
        System.out.println("B类重写抽象方法");
    }
}
