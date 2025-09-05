package com.itheima.Lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {

/*Lambda表达式 作用:替代匿名内部类 创建对象
Lambda表达式  只能替代函数式接口的匿名内部类
函数式接口：有且仅有一个抽象方法的接口*/

/*        Swim s1 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生蛙泳");
            }
        };
        s1.swimming();
 ----------------------------------------------
//      Lambda ==> 只关注 1参数列表 2方法体
    1、可省略 参数类型 和 （一个参数时）括号（）
    2、（方法体只有一行时）可省略  方法体大括号和封号“；” 和 return
-----------------------------------------
*/

        Swim s1 =()-> {
                System.out.println("学生蛙泳");
            };
        s1.swimming();
    }
}
@FunctionalInterface//检验函数式接口（有且仅有一个抽象方法）的注解
interface Swim {
    void swimming();
}

