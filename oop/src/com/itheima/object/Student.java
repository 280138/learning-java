package com.itheima.object;

public class Student {
    String name;
    double chinese;
    double math;

    public void printAllScore(){
        System.out.println(name + " 语文成绩为" + chinese + " 数学成绩为" + math);
    }

    public  void printAverageScore(){
        System.out.println(name + " 平均成绩为" + (chinese + math) / 2);
    }
}
