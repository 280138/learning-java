package com.itheima.staticmethod;

public class VerifyCodeUtil {
    // 私有化构造方法，因为工具类没有创建对象的必要性,不让其它地方创建对象
    private VerifyCodeUtil(){}
//    定义一个方法，生成验证码
    public static String getVerifyCode(int n) {
        String code = "";
        for (int i = 0; i < n; i++) {
            int type = (int) (Math.random() * 3);
            switch (type) {
                case 0:
                    code += (char) (Math.random() * 26 + 'a');
                    break;
                case 1:
                    code += (char) (Math.random() * 26 + 'A');
                    break;
                case 2:
                    code += (int) (Math.random() * 10);
                    break;
            }
        }
        return code;
    }

//    public static void testStringBuilder(){
//        String result = " ";
//        for (int i = 0; i < 3; i++) {
//            result += i;
//        }
////        String result = "1";
////        result = result + "2";
//        System.out.println(result);
//    }
//
//    public static void print(){
//        System.out.println((char) ('A'+25.2));
//    }

}
