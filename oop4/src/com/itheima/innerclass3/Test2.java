package com.itheima.innerclass3;

public class Test2 {
    //目标：搞清楚匿名内部类的语法
    public static void main(String[] args) {
      /*  Swim s1 = new Student();
        Swim s2 = new Teacher();
        start(s1);
        start(s2);
        System.out.println("---------------------");*/

//  -----------------------------------------------------------------------------------
//    在类里写方法，方法里传对象
//    最终目的是创建对象=>匿名内部类简化了创建对象的过程
//-------------------------------------------------------------------------------------

        Swim ss1 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生蛙泳");
            }
        };
        start(ss1);//最终目的是创建对象

        start(new Swim() {
            @Override
            public void swimming() {
                System.out.println("老师自由泳");
            }
        });
    }

    //用方法来实现多态
    public static void start(Swim s){//方法括号中传进来一个对象
        System.out.println("开始。。。");
        s.swimming();//对象回调
        System.out.println("结束。。。");
    }
}

interface Swim{
    void swimming();//实现类的对象都可以调用的方法
}

/*class Teacher implements Swim{
    public void swimming(){
        System.out.println("老师狗爬式游泳");
    }
}
class Student implements Swim{
    public void swimming(){
        System.out.println("学生蛙泳");
    }
}*/
