package com.itheima.extends6constructor;

public class Test2 {
    public static void main(String[] args) {
        Teacher t = new Teacher("dlei","java,大数据",'男');
        System.out.println(t.getName());
        System.out.println(t.getSkill());
        System.out.println(t.getSex());
    }
}
