package com.itheima.extends7this;

public class Students {
    private String name;
    private int age;
    private char sex;
    private String schoolName;

    public Students() {
    }

    public Students(String name, int age, char sex) {
        //this(...)  1调用兄弟构造方法 2必须放在第一行
        //this(...)和super(...)不能同时出现
        this(name,age,sex,"黑马程序");
    }

    public Students(String name, int age, char sex, String schoolName) {
        //super(...)  1调用父类构造方法 2必须放在第一行
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.schoolName = schoolName;
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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
