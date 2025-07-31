package com.itheima.method;

public class MethodDemo3 {
    public static void main(String[] args) {
        //目标：掌握在无返回值方法中单独使用return,提前结束方法
        print(10,0);
        System.out.println("==============");
        print(10,2);
    }

    public static void print(int a,int b){
        if(b==0){
            return;
        }
        System.out.println(a/b);
    }
}
