package com.itheima.extends7this;

public class Test {
    public static void main(String[] args) {
        //理解this(...)
        Students s1 = new Students("张三", 18, '男', "传智播客");
        System.out.println(s1.toString());
        Students s2 = new Students("王五", 22, '女');
        System.out.println(s2);
        Students s3 = new Students("嘉嘉",22, '女');
        System.out.println(s3);
    }
}
