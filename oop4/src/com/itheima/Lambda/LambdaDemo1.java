package com.itheima.Lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        //Lambda表达式 作用:替代匿名内部类（创建对象）
        Animal a = new Animal() {
            @Override
            public void cry(){
                System.out.println("小猫喵喵喵");
            }
        };
        a.cry();
        //错误示范：Lambda并不可以替代全部的匿名内部类
        //        Lambda只能替代函数式接口的匿名内部类
        //函数式接口：有且仅有一个抽象方法的接口
//        Animal a1 = () -> {
//            System.out.println("小猫喵喵喵");
//        };
//        a1.cry();
        System.out.println("======================================");
/*        Swim s1 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生蛙泳");
            }
        };*/
        Swim s1 =()-> {
                System.out.println("学生蛙泳");
            };
        s1.swimming();
    }

}
@FunctionalInterface//检验函数式接口（有且仅有一个抽象方法）的注解
interface Swim {
    void swimming();
}

abstract class Animal {
    public abstract void cry();

}
