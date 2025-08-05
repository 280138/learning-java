package com.itheima.staticmethod;

public class Student {
    private double score;

    //静态方法  static修饰，属于类持有
    public static void printHelloWorld()
    {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    //实例方法：没有static修饰，不属于类持有，属于对象持有
    public void printPass(){
        System.out.print(score);
        System.out.println(score >= 60 ? "通过" : "未通过");
    }

    public void setScore(double score){
        this.score = score;
    }
}
