package com.itheima.Lambda;

import com.itheima.innerclass3.Student;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo2 {
    public static void main(String[] args) {
        //目标：用Lambda简化实际示例
        test1();
        test2();
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
//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();//按照年龄升序
//            }
//        });
//        Arrays.sort(students, (Student o1, Student o2) ->{
//            return o1.getAge() - o2.getAge();//按照年龄升序
//        });
//        Arrays.sort(students, ( o1,  o2) ->{
//            return o1.getAge() - o2.getAge();//按照年龄升序
//        });
        Arrays.sort(students, ( o1,  o2) -> o1.getAge() - o2.getAge()//按照年龄升序
        );


        //遍历数组中的学生对象
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s);//@Data重写toString
        }
    }

    public static void test2(){
        //目标：搞清楚几个匿名内部类使用场景
        //需求：创建一个登录窗口，窗口上只有一个登录按钮
        JFrame win = new JFrame("登录窗口");//桌子
        //调整桌子大小
        win.setSize(300,400);
        win.setLocationRelativeTo( null);//居中显示
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点叉关闭程序

        JPanel panel = new JPanel();
        win.add(panel);  //给桌子加桌布

        JButton btn = new JButton("登录");
        panel.add(btn);  //给桌布加按钮

        //java要求必须给按钮添加一个点击事件监听器对象，来监听用户的点击操作，就可以做出反应
        //开发中不是我们要主动去写匿名内部类，而是用别人功能的时候，别人可以让我们写一个匿名内部类，我们才会写
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("点击了登录按钮");
//            }
//        });
//        btn.addActionListener((ActionEvent e) -> {
//                System.out.println("点击了登录按钮");
//        });
//        btn.addActionListener((e) -> {
//            System.out.println("点击了登录按钮");
//        });
//        btn.addActionListener(e -> {
//            System.out.println("点击了登录按钮");
//        });
        btn.addActionListener(e -> System.out.println("点击了登录按钮")
        );

        win.setVisible(true);//桌子显示出来
    }
}
