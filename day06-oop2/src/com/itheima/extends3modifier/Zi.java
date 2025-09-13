package com.itheima.extends3modifier;

import com.itheima.extends2modifier.Fu;

public class Zi extends Fu{
//    public static void main(String[] args) {
////        Fu f = new Fu();  注意这一句开始不一样
//        Zi z = new Zi();//区别上一句
//
////        z.privateMethod();  不能调用
////        z.method();
//        z.protectedMethod();
//        z.publicMethod();
//    }

    //在继承类中，定义方法去调用父类方法，不写main函数
    public void show(){
//        privateMethod();
//        method;
        protectedMethod();  //执行语句在方法中调用
        publicMethod();
    }
    //没有static修饰 ==> 这是一个实例方法，要用对象来调用
}
