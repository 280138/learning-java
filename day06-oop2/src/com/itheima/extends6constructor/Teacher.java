package com.itheima.extends6constructor;

//子类
public class Teacher extends People {
    private String skill;

    public Teacher(String name, String skill, char sex) {
        //super：子类构造器调用父类构造器
        // 把子类继承父类这部分数据也完成初始化赋值
        super(name,sex);
//        this.setName(name);  this调用兄弟构造器？？
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
