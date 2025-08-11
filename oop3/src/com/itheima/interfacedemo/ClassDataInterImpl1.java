package com.itheima.interfacedemo;

public class ClassDataInterImpl1 implements ClassDataInter{
    //实现类1
    //定义有参构造器传参
    private Student[] students;
    public ClassDataInterImpl1(Student[] students){
        this.students = students;
    }
    @Override
    public void printAllStudentInfos() {
        System.out.println("所有学生信息如下：");
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];//从学生数组中获取指定索引位置的学生对象，并将其赋值给局部变量s
            System.out.println(s.getName() + " " + s.getSex() + " " + s.getScore());
        }
    }

    @Override
    public void printAverageScore() {
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            sum += s.getScore();
        }
        System.out.println("所有学生的平均成绩是：" + sum / students.length);
    }
}
