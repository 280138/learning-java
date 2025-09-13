package com.itheima.extends2modifier;


//private       只能本类
//缺省           本类、同一个包中的类
//protected     本类、同一个包中的类、子孙类
//public        所有类
public class Fu {
    //private   修饰符
    private void privateMethod(){
        System.out.println("privatemethod");
    }
    //缺省   修饰符
    void method(){
        System.out.println("method");
    }
    //protected 修饰符
    protected void protectedMethod(){
        System.out.println("protectedmethod");
    }
    //public  修饰符
    public void publicMethod(){
        System.out.println("publicMethod");
    }

//    privatemethod();方法不能在这里调用
    //方法的调用   只能在：1方法中（比如main方法），2构造器中，3初始块中
public static void main(String[] args) {
    Fu f = new Fu();
    f.privateMethod();
    f.method();
    f.protectedMethod();
    f.publicMethod();
    System.out.println();
}
}
