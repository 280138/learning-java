package com.itheima.extends4feature;


//java中的类只能是单继承，支持多层继承，不支持多继承
//一个类要么直接继承Object,要么默认继承Object,要么间接继承Object
//继承后子类访问成员的特点：就近原则
//就近原则的寻找范围:子类局部==>子类成员==>父类成员==>报错
//子父类重名成员，要在子类中使用父类时，用super调用父类的成员变量/成员方法
public class Test2 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}

class Fu{
    String name = "Fu的name";

    public void run(){
        System.out.println("父类的run方法");
    }
}

class Zi extends Fu{
    String name = "Zi的name";
    public void show(){
        String name = "show的name";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);//super调用父类成员变量
        System.out.println("==========");
//        run();
        super.run(); //super调用父类成员方法
    }

    public void run(){
        System.out.println("子类的run方法");
    }
}
