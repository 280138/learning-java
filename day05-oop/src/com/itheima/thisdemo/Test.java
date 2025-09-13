package com.itheima.thisdemo;

//import com.itheima.constructor.Student;

public class Test {
    public static void main(String[] args) {
        //认识this关键字
        Student s1 = new Student();
        s1.name = "张三";
        s1.print();//哪个对象调用这个方法,this就指向哪个对象
        System.out.println(s1);

        System.out.println();

        Student s2 = new Student();
        s2.name = "zjl";
        s2.print2("唱歌");
    }
}
