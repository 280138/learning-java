package com.itheima.singleinstance;
//懒汉式单例
public class B {
    private B(){}//构造器私有
    private static B b;//定义类变量用来存储对象
    //懒汉式：需要用到对象时才开始创建对象
    public static B getInstance(){
        if (b == null){
            b = new B();
        }
        return b;
    }
}
