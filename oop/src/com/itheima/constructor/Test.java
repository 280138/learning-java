package com.itheima.constructor;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("张三");
        System.out.println();

        Student t1 = new Student();
        t1.name = "hyd";
        t1.age = 18;
        t1.sex = '男';
        System.out.println(t1.name);
        System.out.println(t1.age);
        System.out.println(t1.sex);

        Student t2 = new Student("hyd", 18, '男');
        System.out.println(t2.name);
        System.out.println(t2.age);
        System.out.println(t2.sex);

    }
}
