package com.itheima.polymorphsm3;

public class Wolf extends Animals {
    String name = "狼";
    @Override
    public void run() {
        System.out.println("狼跑得快");
    }
    public void eatSheep(){
        System.out.println("狼吃羊");
    }
}
