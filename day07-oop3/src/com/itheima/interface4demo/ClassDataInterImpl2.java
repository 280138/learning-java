package com.itheima.interface4demo;

public class ClassDataInterImpl2 implements ClassDataInter{
    //实现类1
    //定义有参构造器传参
    private Student[] students;
    public ClassDataInterImpl2(Student[] students){
        this.students = students;
    }
    @Override
    public void printAllStudentInfos(){
        int maleCount = 0;
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];//从学生数组中获取指定索引位置的学生对象，并将其赋值给局部变量s
            System.out.println(s.getName() + " " + s.getSex() + " " + s.getScore());
            if (s.getSex() == '男') {
                maleCount++;
            }
        }
        System.out.println("男生数量为：" + maleCount);
        System.out.println("女生数量为：" + (students.length - maleCount));
    }

    @Override
    public void printAverageScore() {
        System.out.println("所有学生的平均成绩是：");
        Student s1 = students[0];
        double sum = s1.getScore();
        double max = s1.getScore();
        double min = s1.getScore();
        for (int i = 1; i < students.length; i++) {
            Student s = students[i];
            sum += s.getScore();
            if (s.getScore() > max) {
                max = s.getScore();
            } else if (s.getScore() < min) {
                min = s.getScore();
            }
        }
        System.out.println("最高成绩为：" + max);
        System.out.println("最低成绩为：" + min);
        System.out.println("平均成绩为：" + (sum - max - min)/ (students.length - 2));
    }
}
