package com.itheima.extends2modifier;


//private       只能本类
//缺省           本类、同一个包中的类
//protected     本类、同一个包中的类、子孙类
//public        所有类
public class Test {
    public static void main(String[] args) {
        Fu f = new Fu();
//        f.privateMethod();不能调用
        f.method();//缺省
        f.protectedMethod();
        f.publicMethod();
    }
}
