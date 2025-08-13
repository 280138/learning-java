package com.itheima.code;

public class CodeDemo2 {
    private String name;
    private String[] directions = new String[4];
    //实例代码块：无static修饰，属于对象，每次创建对象时，都会优先执行一次,在构造器前执行
    //作用：初始化对象的实例资源
    {
        System.out.println("实例代码块");
        name = "itheima";//赋值
        directions[0] = "N";
        directions[1] = "S";
        directions[2] = "W";
        directions[3] = "E";
    }
    public static void main(String[] args) {
        System.out.println("main方法");
        new CodeDemo2();
        new CodeDemo2();
        new CodeDemo2();
    }
}
