package com.itheima.javabean;
//实体类
//实体类作用：创建对象，存取数据（封装数据）

//实体类要求（2）
//1 类中成员变量全部私有，并提供public修饰的getter和setter方法
//2 类中需要提供无参构造器，有参构造器可选
public class Student {
    private String name;
    private double chinese;
    private double math;

    //构造方法
    public Student() {
    }

    public Student(String name, double chinese, double math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    //用共有方法控制私有属性
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }
}
