package com.itheima.extends5override;

//重写规范:声明不变，重新实现
public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.cry();
//        cat.super.cry();  写法不正确，要在cat类中增添一个方法来调用父类方法
        cat.callParentCry();
    }
}

class Cat extends Animal{
    //方法重写：方法名称、形参列表必须一样，这个方法就是方法重写
    //而重载是方法名一样，形参列表不一样
    //重写：声明不变，重新实现
    @Override//方法重写的校验注解（标志）：要求方法名称和形参列表必须与被重写方法一致，否则报错。
    public void cry(){
        System.out.println("喵喵喵");
    }
    public void callParentCry(){
        super.cry();
    }
}

class Animal{
    public void cry(){
        System.out.println("动物会叫~~~~");
    }
}
