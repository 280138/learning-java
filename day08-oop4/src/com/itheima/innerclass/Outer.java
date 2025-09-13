package com.itheima.innerclass;

public class Outer {
    public static String schoolName = "黑马程序员";
    private int age;

    public static void test(){
        System.out.println("test()");
    }
    public void run(){
        System.out.println("外部类的实例方法run()");
    }

    //成员内部类：无static修饰，属于外部类对象持有的
    public class Inner extends Object{
        //成员变量
        private String name;
        public void show(){
            System.out.println("show");
            System.out.println(schoolName);//Outer.schoolName
            test();
            //也可以直接访问外部类的实例成员
            System.out.println(age);//成员内部类是在创建是放在外部类的对象里的
            run();
            System.out.println(this);//自己的对象
            System.out.println(Outer.this);//外部类的对象
        }
        //构造器
        public Inner() {
            System.out.println("Inner() name = " + name);
        }

        public Inner(String name) {
            this.name = name;
        }

        //getter and setter
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
