package com.itheima.object;

public class TestStudent {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";
        s1.chinese = 80;
        s1.math = 90;
        s1.printAllScore();
        s1.printAverageScore();
    }
}
