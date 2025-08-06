package com.itheima.extends1demo;

public class Test {
    //目标：认识继承的好处

    //子类可以继承父类的非私有成员（成员变量、成员方法）
    //不能访问私有变量name但是可以通过访问共有方法setname设置name
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("zyc");
        t.setSkill("打篮球");
        t.setSex('男');
        System.out.println(t.getName());
        System.out.println(t.getSkill());
        System.out.println(t.getSex());
    }

//    public class Test {
//        //目标：认识继承的好处
//        Teacher t = new Teacher();
//        t.setName()      //执行语句要放在方法中调用，此处不在方法中调用
//    }
//    为什么创建的对象t拿不到该类中的方法，而我同样的代码放到main中运行就成功了
}
