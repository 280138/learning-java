package com.itheima.interface1;

public class Test {
    //接口不能创建对象
    //接口是拿来被类实现的，实现接口的类被称为实现类，一个类可以同时实现多个接口
    public static void main(String[] args) {
        C c = new C();
        c.run();
        System.out.println(c.go());
        c.play();
    }
}

//C被称为实现类，同时实现了多个接口
//实现类实现了多个接口，必须重写完全部接口的全部抽象方法，否则这个类必须被定义成抽象类
class C implements B,A{

    @Override
    public void run() {
        System.out.println("C类重写了run方法");
    }

    @Override
    public String go() {
        return "黑马找磊哥";
    }

    @Override
    public void play() {
        System.out.println("C类重写了play方法");
    }
}