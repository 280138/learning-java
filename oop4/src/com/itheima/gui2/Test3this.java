package com.itheima.gui2;

public class Test3this {
    public static void main(String[] args) {
        //目标:了解 this 作为方法参数传递
        //此时this代表当前类的对象
        Sender xiaoming = new Sender("小明");
        ExpressStation station = new ExpressStation();

        xiaoming.sendPackage("生日礼物", station);
    }
}
// 快递站类
class ExpressStation {
    // 收件方法：需要知道包裹和寄件人信息
    public void receivePackage(String packageName, Sender sender) {
        System.out.println("收到包裹：" + packageName);
        System.out.println("寄件人：" + sender.getName()); // 通过身份证获取寄件人名字
        sender.confirmReceipt(); // 通知寄件人
    }
}

// 寄件人类（你）
class Sender {
    private String name;

    public Sender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 寄包裹动作
    public void sendPackage(String packageName, ExpressStation station) {
        // 关键操作：把自己的身份证复印件(this)传给快递站
        station.receivePackage(packageName, this);
    }

    public void confirmReceipt() {
        System.out.println(name + "：包裹已确认签收！");
    }
}



