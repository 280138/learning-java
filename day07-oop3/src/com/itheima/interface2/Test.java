package com.itheima.interface2;

public class Test {
    public static void main(String[] args) {
        //接口弥补了类单继承的不足，一个类可以同时实现多个接口，使类的功能更多，功能更强大
        People p = new Student();
        Driver d = new Student();//多态
        BoyFriend bf = new Student();

        //让程序可以面向接口编程，右边更利于程序的解耦合
        Driver a = new Student();//Driver a = new Teacher();
        BoyFriend b = new Student();//BoyFriend b = new Teacher();
    }
}

interface Driver{}
interface BoyFriend{}
class People{}

class Student extends People implements Driver,BoyFriend{}
class Teacher implements Driver,BoyFriend{}
