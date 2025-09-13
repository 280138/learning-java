package com.itheima.staticmethod;

public class TestVerifyCodeUtil {
    public static void main(String[] args) {
        String code = VerifyCodeUtil.getVerifyCode(4);
        System.out.println(code);

//        VerifyCodeUtil.testStringBuilder();
//        VerifyCodeUtil.print();
    }
}
