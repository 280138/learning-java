package com.itheima.staticfield;

public class Test2 {
    public static void main(String[] args) {
        new User();
        new User();
        new User();
        new User();
        ////静态变量只有在自己类中访问类名可以定义不写
        //而在其它类中必须带类名访问
        System.out.println(User.count);
    }
}
