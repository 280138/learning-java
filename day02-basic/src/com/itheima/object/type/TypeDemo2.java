package com.itheima.object.type;

public class TypeDemo2 {
    public static void main(String[] args) {
        //目标：理解表达式的自动类型提升
        int result = cal2((byte)110,(byte) 120);
        System.out.println(result);
        int result2 = cal3((byte) 110,(byte)120);//数据溢出
        System.out.println(result2);
    }

    public static double cal(int a, int b, double c, char r){
        return a+b+c+r;
    }

    public static int cal2(byte a, byte b) {
        return a+b;
    }

    public static int cal3(byte a, byte b) {
        byte c = (byte)(a+b);
        return c;
    }
}
