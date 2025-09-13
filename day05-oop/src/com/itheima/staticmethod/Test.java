package com.itheima.staticmethod;

public class Test {
    public static void main(String[] args) {
        //1.静态方法的两种调用
        //类名.静态方法（）  （推荐）
        Student.printHelloWorld();
        //对象.静态方法()  （不推荐）
        Student s1 = new Student();
        s1.printHelloWorld();

        //2.实例方法的调用
        //对象.实例方法（）
        s1.setScore(59.2);
        s1.printPass();

        //Test.printHello();
        //静态方法在本类中调用可以省略类名，但静态方法在其他类中调用必须写类名
        printHello();
    }

    public static void printHello(){
        System.out.println("hello world");
        System.out.println("hello world");
    }
}
