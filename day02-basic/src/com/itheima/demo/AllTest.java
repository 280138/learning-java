package com.itheima.demo;

import java.util.Scanner;

public class AllTest {
    public static void main(String[] args) {
        //目标：完成健康计算器
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的身高：");
        double height = sc.nextDouble();
        System.out.println("请输入你的体重：");
        double weight = sc.nextDouble();
        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入你的性别：");
        String sex = sc.next();

        double bmi = calcBMI(height, weight);
        System.out.println("BMI：" + bmi);
        System.out.println("BMR:" + calcBMR(height, weight, age, sex));
    }

    public  static  double calcBMI(double height,double weight){
        return weight/(height*height);
    }

    public  static  double calcBMR(double height,double weight,int age,String sex){
        double bmr = 0;
        if(sex.equals("男")){
            bmr = 88.362 + (13.7 * weight) + (5 * height) - (6.8 * age);
        }else{
            bmr = 447.6 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
        }
        return bmr;
    }
}
