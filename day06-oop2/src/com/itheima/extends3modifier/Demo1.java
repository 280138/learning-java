package com.itheima.extends3modifier;

import com.itheima.extends2modifier.Fu;

public class Demo1{
    public static void main(String[] args) {
        Fu f = new Fu();
//        f.method();      不能访问
//        f.protectedMethod();  不能访问
        f.publicMethod();
    }
}
