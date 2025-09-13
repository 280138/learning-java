package com.itheima.innerclass3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    //姓名 年龄 身高 性别
    private String name;
    private int age;
    private int height;
    private char sex;
}
