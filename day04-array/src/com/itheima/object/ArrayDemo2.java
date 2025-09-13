package com.itheima.object;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args){
        inputScore();
    }

    public static void inputScore(){
        Scanner sc = new Scanner(System.in);

        //   动态初始化数组
        //数据类型[] 数组名 = new 数据类型[数组的长度]
        double[] grades = new double[5];
        for (int i=0;i<grades.length;i++){
            System.out.println("请输入第" + (i+1) + "个同学的分数：");
            grades[i] = sc.nextDouble();
        }

        double sum = 0;
        double min = grades[0];
        double max = grades[0];
        for (int i=0;i<grades.length;i++){
            sum += grades[i];

            if(grades[i] < min){
                min = grades[i];
            }
            if(grades[i] > max){
                max = grades[i];
            }
        }
        System.out.println("平均分是" + sum/grades.length);
        System.out.println("最小分是" + min);
        System.out.println("最大分是" + max);
    }
}
