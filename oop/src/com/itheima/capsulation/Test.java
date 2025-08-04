package com.itheima.capsulation;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("张三",22,80,90);
        System.out.println(s1.getName());
        s1.setName("王五");
        System.out.println(s1.getName());
    }
}
