package com.itheima.polymorphsmdemo;

public class SilverCard extends Card{
    public SilverCard(String card, String name, String phone, double money) {
        super(card, name, phone, money);
    }
    @Override
    public void consume(double money) {
        System.out.println("您当前银卡消费:" + money);
        System.out.println("优惠后的价格：" + money * 0.9);
        if (getMoney() < money * 0.9){
            System.out.println("余额不足，消费失败");
            return;//退出方法
        }
        //更新金卡的账户余额
        setMoney(getMoney() - money * 0.9);
        System.out.println("您当前金卡余额为：" + getMoney());
    }
}
