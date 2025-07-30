package com.itheima.variable;

import com.sun.org.apache.xpath.internal.objects.XString;

public class VariableDemo2 {
    public static void main(String[] args) {
        //目标：掌握8种数据类型定义变量
        printVariable();
    }

    //请帮我设计一个方法，打印出8种基本数据类型定义的变量
    public static void printVariable() {
        byte b = 10;
        System.out.println(b);
        short s = 10;
        System.out.println(s);
        int i = 10;
        System.out.println(i);
        //长整型，本来默认是int，但是加上L，就会变成long
        long l = 10L;
        System.out.println(l);
        //浮点型，本来默认是double，但是加上f，就会变成float
        float f = 10.5f;
        System.out.println(f);
        double d = 10.5;
        System.out.println(d);
        //字符型，必须用单引号括起来
        char c = 'a';
        System.out.println(c);
        boolean bool = true;
        System.out.println(bool);
        //字符串型，必须用双引号括起来   S是大写字母
        String str = "Hello World";
        System.out.println(str);
        System.out.println("===================");
    }

}
