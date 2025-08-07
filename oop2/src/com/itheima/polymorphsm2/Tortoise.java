package com.itheima.polymorphsm2;

public class Tortoise extends Animals {
    String name = "乌龟";
    @Override
    public void run() {
        System.out.println("乌龟跑得慢");
    }

    public void shrinkHead(){
        System.out.println("乌龟缩小了头");
    }
}
