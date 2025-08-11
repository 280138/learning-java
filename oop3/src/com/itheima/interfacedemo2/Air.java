package com.itheima.interfacedemo2;

public class Air extends JD{
    public Air(String name, boolean status){
        //子类构造器必须“先”调用父类构造器，再调用自己构造器
        super(name, status);
    }
}
