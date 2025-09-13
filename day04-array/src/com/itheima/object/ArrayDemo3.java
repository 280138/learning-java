package com.itheima.object;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //目标：完成数组求最值
        int[] arr = {10,20,30,40,50};
        int max = getMax(arr);
        System.out.println("最大值是" + max);
    }

    //定义一个方法，求数组最值返回
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
