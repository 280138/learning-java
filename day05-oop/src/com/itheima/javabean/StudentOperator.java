package com.itheima.javabean;

public class StudentOperator {
    //实体类的对象只负责数据存取，而对数据业务的处理交给其它类的对象来完成，以实现数据和数据业务处理分离
    private Student s;
    public StudentOperator(){
    }
    public StudentOperator(Student s)
    {
        this.s = s;
    }

    public void printAllScore()
    {
        System.out.println(s.getName() + "的语文成绩是：" + s.getChinese());
        System.out.println(s.getName() + "的数学成绩是：" + s.getMath());
    }

    public void printAverageScore()
    {
        double average = (s.getChinese() + s.getMath()) / 2;
        System.out.println(s.getName() + "的平均成绩是：" + average);
    }
}
