package com.itheima.interfacedemojiaju;
//智能控制系统：单例类
public class SmartHomeControl {
    private static final SmartHomeControl smartHomeControl = new SmartHomeControl();
    private SmartHomeControl(){}
    public static SmartHomeControl getInstance(){
        return smartHomeControl;
    }

    public void control(JD jd) {
        //-----多态-------
        //为什么不定义数组类型参数JD[]？定义传入对象的父类类型JD
        System.out.println(jd.getName() + "状态目前是:" + (jd.getStatus()==Status.UP ? "开":"关"));
        System.out.println("开始您的操作");
        jd.press();//子类调用的是1父类2实现 的方法（接口重写的是public）
        System.out.println(jd.getName() + "状态目前是:" + (jd.getStatus()==Status.UP?"开":"关"));

    }

    public void printAllStatus(JD[] jds) {
        for (int i = 0; i < jds.length; i++) {
            JD jd = jds[i];
            System.out.println((i+1) + "、" +jd.getName() + "状态目前是:" + (jd.getStatus()==Status.UP?"开":"关"));
        }
    }
}
