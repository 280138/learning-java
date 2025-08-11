package com.itheima.extends6constructor;

public class Test {
    public static void main(String[] args) {
        //子类构造器必须“先”调用父类构造器，再调用自己构造器
        Zi z = new Zi();
    }
}

class Zi extends Fu{

    public Zi(){
        super();  //顺序不能调换，父类构造器一定要先调用
        System.out.println("子类无参构造方法");
//        super(5);
    }
}
class Fu{
    //构造器没有返回值，属于类本身，不能被继承
    public Fu(){
        System.out.println("父类无参构造方法");
    }
    public Fu(int a){
        System.out.println("父类有参构造方法");
    }
}

