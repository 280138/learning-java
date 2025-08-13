package com.itheima.innerclass;

public class InnerClassDemo1 {

    public static void main(String[] args) {
        //目标：了解成员内部类
        //成员内部类创建对象的格式：
        //外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
        Outer.Inner oi = new Outer().new Inner();
        oi.setName("张三");
        oi.show();
        //成员内部类访问外部成员的特点
        //1、成员内部类中可以直接访问外部类的静态成员和实例成员
        //2、成员内部类的实例方法中，可以直接拿到当前寄生的外部类对象：外部类名.this
        People.Heart heart = new People().new Heart();
        heart.show();
    }
}

class People{
    private int heartBeat = 100;
    public class Heart{
        private int heartBeat = 80;
        public void show(){
            int heartBeat = 200;
            System.out.println(heartBeat);//200
            System.out.println(this.heartBeat);//80
            System.out.println(People.this.heartBeat);//100
        }
    }
}
