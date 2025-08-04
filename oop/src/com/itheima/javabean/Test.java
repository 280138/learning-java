package com.itheima.javabean;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("波仔");
        s1.setChinese(90);
        s1.setMath(120);
        System.out.println(s1.getName() + "语文成绩为" + s1.getChinese());
        System.out.println(s1.getName() + "数学成绩为" + s1.getMath());
        System.out.println();

//        Student s2 = new Student("波妞", 90, 120);
//        System.out.println(s1.getName() + "语文成绩为" + s1.getChinese());
//        System.out.println(s1.getName() + "数学成绩为" + s1.getMath());
//        System.out.println();

        StudentOperator operator = new StudentOperator(s1);
        operator.printAllScore();
        operator.printAverageScore();
    }
}
