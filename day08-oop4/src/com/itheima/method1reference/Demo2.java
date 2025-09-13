package com.itheima.method1reference;

import java.util.Arrays;
import java.util.Comparator;

public class Demo2 {
    public static void main(String[] args) {
        test1();
    }

    public static void test1(){
        Student[] students = new Student[6];
        students[0] = new Student("小王", 18, 170, '男');
        students[1] = new Student("小张", 19, 180, '男');
        students[2] = new Student("小李", 17, 160, '男');
        students[3] = new Student("小赵", 18, 170, '女');
        students[4] = new Student("小孙", 19, 180, '女');
        students[5] = new Student("小周", 17, 160, '女');

        //需求：按照年龄升序排序，调用sun公司写好的API直接对数组进行排序
        Student t = new Student();

//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return t.compareByHeight(o1, o2);
//            }
//        });

//        Arrays.sort(students, ((o1, o2) -> t.compareByHeight(o1,o2)));

//        “->”前后参数一致，可以用实例方法应用
//        实例方法引用    对象名::实例方法
        Arrays.sort(students, t::compareByHeight);


        //遍历数组中的学生对象
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s);//@Data重写toString
        }
    }
}
