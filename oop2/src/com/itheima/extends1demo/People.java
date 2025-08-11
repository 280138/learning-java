package com.itheima.extends1demo;
//父类
public class People {
    private String name;
    private char sex;

    //-------------------下面的全部都可以被继承
    //用共有方法设置私有变量
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
}
