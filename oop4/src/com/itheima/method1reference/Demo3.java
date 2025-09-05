package com.itheima.method1reference;

import java.util.Arrays;
import java.util.Comparator;

public class Demo3 {
    public static void main(String[] args) {
        //目标：特定类型的方法应用
        //需求：有一个字符串数组，里面有一些人的名字都是，英文名称，请按照名字的首字母升序排序
        String[] names = {"Tom","Jerry","Mike","Mary","Smith","angel","Andy","Black","bb"};

        //数组排序: Arrays.sort(names,Comparator)
        //Arrays.sort(names,Comparator)默认首字母的编号升序排序
        //要求：忽略首字母的大小进行排序（java官方默认是搞不定的，需要我们自己指定比较规则）

//        Arrays.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);//忽略大小写进行排序
//            }
//        });

//        Arrays.sort(names, ( o1,  o2)  -> o1.compareToIgnoreCase(o2));

        //此时，如果某个Lambda表达式里只是调用一个特定类型的实例方法，并且第一个参数是主调，后面所有参数都是入参，就可以用方法引用
        //                   类名：：方法
        Arrays.sort(names, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(names));
    }
}
