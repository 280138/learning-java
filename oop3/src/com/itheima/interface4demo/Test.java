package com.itheima.interface4demo;

public class Test {
    public static void main(String[] args) {
        //1、定义学生类，创建学生对象，封装学生数据，才能交给别人处理学生的数据
        //2、准备学生数据，自己造一些测试数据
        Student[] allStudents = new Student[10];//动态初始化
        allStudents[0] = new Student("小王", '男', 90);//数组 存学生类型的对象
        allStudents[1] = new Student("小张", '女', 80);
        allStudents[2] = new Student("小李", '男', 70);
        allStudents[3] = new Student("小赵", '女', 60);
        allStudents[4] = new Student("小孙", '男', 50);
        allStudents[5] = new Student("小周", '女', 40);
        allStudents[6] = new Student("小吴", '男', 30);
        allStudents[7] = new Student("小郑", '女', 20);
        allStudents[8] = new Student("李四", '男', 10);
        allStudents[9] = new Student("赵敏", '女', 100);

        //3、提供两套业务实现方案，支持灵活切换（解耦合），面向接口编程
        //  --定义一个接口（规范思想）：必须完成打印全班学生信息，打印平均分
        //  --定义第一套实现类，实现接口：实现打印学生信息，实现打印平均分
        //  --定义第二套实现类，实现接口：实现打印学生信息（男女人数），实现打印平均分（去掉最高分和最低分）
        ClassDataInter cdi = new ClassDataInterImpl2(allStudents);
        cdi.printAllStudentInfos();
        cdi.printAverageScore();
    }
}
