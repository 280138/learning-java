package com.itheima.extends5override;

public class Test2 {

    public static void main(String[] args) {
        //目标：重写Object类中的toString()方法
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);
        s.setSex('男');
//        System.out.println(s.toString());返回s的地址，没有意义
        System.out.println(s);
    }
}

class Student extends Object{
    private String name;
    private int age;
    private char sex;

    //重写以后输出对象时默认调用子类重写的toString()方法返回对象的内容
    @Override//重写校验注解（检查是否名字和形参列表是否一致）
    public String toString() {
        return "name=" + getName() + " age=" + getAge() + " sex=" + getSex();
    }

//generate自动生成的
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", sex=" + sex +
//                '}';
//    }

    public Student() {
    }

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
