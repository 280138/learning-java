package com.itheima.interfacedemojiaju;

public class WashMachine extends JD{
    public WashMachine(String name, Status status){
        //子类构造器必须“先”调用父类构造器，再调用自己构造器
        super(name, status);
    }
}
