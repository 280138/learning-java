package com.itheima.innerclass3;

public class Test {
    public static void main(String[] args) {
        //匿名内部类：1、继承/实现 2、重写 3、创建对象
        //匿名内部类实际上有名字：外部类名$编号.class
        //匿名内部类本质是一个子类，同时会立即构建一个子类对象
        //作用：更方便创造出一个对象
        Animal a = new Animal() {
            @Override
            public void cry() {
                System.out.println("这是匿名内部类");
            }
        };
        a.cry();
    }
}

//class Cat extends Animal{
//
//    @Override
//    public void cry() {
//        System.out.println("猫是喵喵叫~~~");
//    }
//}
