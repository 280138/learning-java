package com.itheima.staticfield;

public class User {
    //静态变量
    public static int count = 0;

    //构造器
    public User()
    {
    //  User.count++;
        //注意：同一个类中访问静态成员可以省略类名不写
        count++;
    }
}
