package com.itheima;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //目标：二维数组的认识
        printArray();
        System.out.println("------------------");
        printArray2();
    }

    //定义一个方法，静态初始化二维数组
    public static void printArray(){
        String [][] names = {
                {"小王","小张","小李"},  //0
                {"小赵","小钱","小孙","zyc"},//1
                {"小周","小吴","小郑"}//2
        };

        //二维数组的访问1
        String[] name1 = names[2];//names[2]是二维数组的第三行,用一维数组接收
        for (int i = 0; i < name1.length; i++) {
            System.out.println(name1[i]);
        }

        //二维数组的访问2
        System.out.println(names[1][3]);
        System.out.println(names[2][2]);

        //动态初始化二维数组
        String[][] arr = new String[3][4];

    }

    //遍历二维数组
    public static void printArray2(){
        String[][] arr = {
                {"小王","小张","小李"},  //0
                {"小赵","小钱","小孙","zyc"},//1
                {"小周","小吴","小郑"}//2
        };

        //第一种遍历
        for (int i = 0; i < arr.length; i++) {
            String names[] = arr[i];
            for (int j=0;j<names.length;j++){
                System.out.print(names[j]+"\t");
            }
            System.out.println();
        }
        System.out.println("------------------");

        //第二种遍历（推荐）
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
