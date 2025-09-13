package com.itheima.polymorphsmdemo;

public class GoldCard extends Card{
    //构造器继承不了，用super(...)调用父类构造器
    public GoldCard(String card, String name, String phone, double money) {
        super(card, name, phone, money);
    }
    @Override
    public void consume(double money) {
        System.out.println("您当前金卡消费:" + money);
        System.out.println("优惠后的价格：" + money * 0.8);
        if (getMoney() < money * 0.8){
            System.out.println("余额不足，消费失败");
            return;//退出方法
        }
        //更新金卡的账户余额
        setMoney(getMoney() - money * 0.8);
        System.out.println("您当前金卡余额为：" + getMoney());
        //判断消费如果大于200，调用独有功能，打印洗车票
        if(money * 0.8 >= 200){
            printTicket();
        }else{
            System.out.println("您没有消费200以上，没有打印洗车票");
        }
    }
    //打印洗车票
    public void printTicket(){
        System.out.println("您消费了，请打印洗车票");
    }
}
