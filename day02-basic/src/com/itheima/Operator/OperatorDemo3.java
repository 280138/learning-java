package com.itheima.Operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        //掌握扩展的赋值运算符
        receive(5);
    }

    public static void receive(int b) {
        byte a = 10;
        a += 5;//等价于a = (a的类型)a + 5;自带强转
        System.out.println("钱包金额为："+ a);
    }

    public static void demo2() {
        byte a1 = 10;
        byte a2 = 20;
        a1 = (byte)(a1 + a2);//表达式的自动转换
    }
}
