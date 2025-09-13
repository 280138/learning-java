package com.itheima.innerclass2;
//外部类
public class Outer {
    public static String schoolName = "黑马程序员";
    private int age;
    //静态内部类：属于外部类本身持有
    //而成员内部类则是：属于外部类对象持有
    public static class Inner{
        private String name;
        public void show() {
            //1、静态内部类中是否可以直接访问外部类的静态成员？可以
            System.out.println(schoolName);//Outer.schoolName同类中类名省略
            //2、静态内部类中是否可以直接访问外部类的实例成员？不可以
            //System.out.println(age);//报错

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
