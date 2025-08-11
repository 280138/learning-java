package com.itheima.abstract3;

public class Test {
    public static void main(String[] args) {
        //模板方法设计模式
        //学生和老师都要写一篇作文《我的爸爸》
        //第一段一样 11111111
        //第二段不一样  老师和学生各自写各自的，不允许抄袭
        //第三段一样 33333333

        //模板方法的实现
        //在抽象类中定义2个方法，一个模板方法，放相同的代码，
        //                 另一个抽象方法，放不同的实现
        Student s = new Student();
        s.write();
        Teacher t = new Teacher();
        t.write();
    }
}
