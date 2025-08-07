package com.itheima.polymorphsm3;

public class Test {
    public static void main(String[] args) {
        //了解多态下的强制转换
        //强转格式：子类 变量名 = （子类）父类变量

        Animals a = new Wolf();
        a.run();
        System.out.println(a.name);
        System.out.println("==========");
        //强制类型转换
        Wolf w1 = (Wolf) a;
        w1.eatSheep();
        System.out.println(a instanceof Tortoise);
        //有继承方式就可以强转，编译阶段不会报错，而运行阶段会报错ClassCastException
        // Tortoise t1 = (Tortoise) a;
        System.out.println("==========");
        Wolf w = new Wolf();
        go(w);
        Tortoise t = new Tortoise();
        go(t);
    }
    public static void go(Animals a){
        System.out.println("开始。。。。");
        a.run();
        if (a instanceof Wolf){  //instanceof判断当前对象真实类型
            Wolf w = (Wolf) a;
            w.eatSheep();
        }else if (a instanceof Tortoise){
            Tortoise t = (Tortoise) a;
            t.shrinkHead();
        }
    }
}
