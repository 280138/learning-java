package com.itheima.object.method;

public class MethodDemo1 {
    //目标:掌握方法的定义和调用
    public static void main(String[] args) {
        int sum = getSum(10,20);
        System.out.println("和是" + sum);
        printHelloWorld();
        test();
        System.out.println(getVerifyCode(4));
    }
    //定义一个方法，求两个任意整数的和
    public static int getSum(int a,int b){
        return a + b;
    }

    //无参数（括号内没东西），无返回值（返回值声明void)类型
    public static void printHelloWorld(){
        System.out.println("Hello world");
        System.out.println("Hello world");
    }

    //定义一个方法，获取一个指定位数的验证码返回
    //需要接收数据吗？需要，需要接收位数  引入形参len
    //需要返回数据吗？需要，返回验证码    String
    //有参数有返回值的方法
    public static String getVerifyCode(int len){
        String code = "";
        for (int i = 0; i < len; i++) {
            int number = (int)(Math.random() * 10);
            code += number;
        }
        return code;
    }

    //测试String型的拼接
    public static void test(){
        String a = "";
        System.out.println(a + 2 +3 +4);
        System.out.println(a + (2 +3 +4));
        System.out.println(a + 23 + 4);
        System.out.println("====================");
    }

}
