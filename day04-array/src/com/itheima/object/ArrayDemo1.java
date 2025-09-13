package com.itheima.object;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //目标：认识使用数组的好处，数组的定义、访问
        callStudent();
    }

    //需求：定义一个随机点名的方法，假设有15名学生
    public static void callStudent(){
        //静态初始化
        //String[] names = {"小王","小张","小李","小赵","小钱","小孙","小周","小吴","小郑","小王","小王","小王","小王","小王"};
        String[] names = new String[]{"小王","小张","小李","小赵","小钱","小孙","小周","小吴","小郑","小王","小王","小王","小王","小王"};
        //String names[] = new String[]{"小王","小张","小李","小赵","小钱","小孙","小周","小吴","小郑","小王","小王","小王","小王","小王"};
        //获取随机索引值
        int index = (int)(Math.random() * names.length);//names.length 数组长度（元素个数）
        System.out.println(names[index]);
    }
}
