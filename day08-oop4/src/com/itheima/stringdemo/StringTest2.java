package com.itheima.stringdemo;

public class StringTest2 {
    //帮我生成指定位数的随机验证码返回，每位可能是大小写字母或者数字
    public static void main(String[] args) {
        System.out.println(getCode(4));
    }
    public static String getCode(int n) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int index = (int)(Math.random() * str.length());
            char c = str.charAt(index);
            sb.append(c);
        }
        return sb.toString();//StringBuilder 类已经重写了从 Object 继承来的 toString() 方法
    }
}

// Object类中的默认实现
//public String toString() {
//    return getClass().getName() + "@" + Integer.toHexString(hashCode());
    // 返回格式：类名@哈希码（如：java.lang.StringBuilder@1b6d3586）
//}
// StringBuilder中的重写实现
//@Override
//public String toString() {
//    // 返回StringBuilder内部字符序列构成的字符串
//    return new String(value, 0, count);
//}

