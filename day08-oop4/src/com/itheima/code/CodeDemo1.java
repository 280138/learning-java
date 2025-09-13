package com.itheima.code;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CodeDemo1 {
    public static String schoolName;
    public static String[] cards = new String[54];
    //静态代码块：static修饰，属于类，优先加载，自动执行一次
    //基本作用：可以完成对类的静态资源的初始化,最佳实践
    static {
        System.out.println("静态代码块执行了");
        schoolName = "黑马程序员";
        cards[0] = "A";
        cards[1] = "2";
        cards[2] = "3";
    }
    public static void main(String[] args) {
        System.out.println("main方法执行了");
        System.out.println(Arrays.toString(cards));
    }
}
