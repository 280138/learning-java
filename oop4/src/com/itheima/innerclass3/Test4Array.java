package com.itheima.innerclass3;

import java.util.Arrays;
import java.util.Comparator;

public class Test4Array {
    public static void main(String[] args) {
        //目标：完成给数组排序，理解匿名内部类
        Student[] students = new Student[6];
        students[0] = new Student("小王", 18, 170, '男');
        students[1] = new Student("小张", 19, 180, '男');
        students[2] = new Student("小李", 17, 160, '男');
        students[3] = new Student("小赵", 18, 170, '女');
        students[4] = new Student("小孙", 19, 180, '女');
        students[5] = new Student("小周", 17, 160, '女');

        //需求：按照年龄升序排序，调用sun公司写好的API直接对数组进行排序
        //public static void sort(T[] a, Comparator c)
        //  参数一：需要排序的数组     参数二：需要给sort声明一个Comparator比较器对象(指定排序的规则)
        //sort方法内部会调用匿名内部类对象的compare方法，对数组中的学生对象进行排序
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //指定排序规则：
                //如果你认为左边对象 大于 右边对象，返回正整数
                //如果你认为左边对象 小于 右边对象，返回负整数
                //如果两边相等，返回0
//                if (o1.getAge() > o2.getAge()){
//                    return 1;
//                }else if (o1.getAge() < o2.getAge()){
//                    return -1;
//                }
//                return 0;
                return o1.getAge() - o2.getAge();//按照年龄升序
//                return o2.getAge() - o1.getAge();//按照年龄降序
            }
        });

        //遍历数组中的学生对象
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s);//@Data重写toString
        }
    }

}
