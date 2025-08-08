package com.itheima.polymorphsmdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok可以实现为类自动添加getter、setter、无参构造器、toString、equals、hashCode
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private String carId;//车牌号码
    private String name;
    private String phone;
    private double money;//余额

    //预存金额
    public void deposit(double money){
        this.money += money;
    }
    //消费金额
    public void consume(double money){
        this.money -= money;
    }
}
