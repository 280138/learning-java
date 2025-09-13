package com.itheima.extends1demo;

public class Test {
    //目标：认识继承的好处

    //子类可以继承父类的非私有成员（成员变量、成员方法）
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("zyc");//父类非私有，直接调用
        t.setSkill("打篮球");//子类自己的方法方法
        t.setSex('男');//父类非私有，直接调用
        System.out.println(t.getName());
        System.out.println(t.getSkill());
        System.out.println(t.getSex());
    }

//    public class Test {
//        //目标：认识继承的好处
//        Teacher t = new Teacher();
//        t.setName()      //执行语句要放在方法中调用，此处不在方法中调用
//    }
}
