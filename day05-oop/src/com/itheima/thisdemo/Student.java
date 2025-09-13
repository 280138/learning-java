package com.itheima.thisdemo;

public class Student {
    String name;
    public void print(){
        //this是一个变量，在方法中用于指向当前对象
        //哪个对象调用这个方法,this就指向哪个对象
        System.out.println(this);
        System.out.println(this.name);
    }

    public void print2(String name){
        System.out.println(this.name + "喜欢" +"唱歌");
    }
}
