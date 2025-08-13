package com.itheima.innerclass2;

public class InnerClassDemo2 {
    public static void main(String[] args) {
        //目标：搞清楚静态外部类
        //创建对象：外部类名.内部类名 对象名 = new 外部类名.内部类名();
        Outer.Inner inner = new Outer.Inner();
        inner.show();
    }
}
