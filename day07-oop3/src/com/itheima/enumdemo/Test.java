package com.itheima.enumdemo;

public class Test {
    public static void main(String[] args) {
        //需求：模拟上下左右移动图片
        //第一种是常量做信息标志和分类
        move(Constant.UP);//形参列表不约束：move(334)
        //第二种是枚举做信息标志和分类
        move2(Direction.UP);//限制了入参类型
    }
    public static void move2(Direction direction){
        switch(direction){
            case UP:    //switch标签必须使用常量==>static final
                System.out.println("向上移动");
                break;
            case DOWN:
                System.out.println("向下移动");
                break;
            case LEFT:
                System.out.println("向左移动");
                break;
            case RIGHT:
                System.out.println("向右移动");
                break;
        }
    }
    public static void move(int direction){
        switch(direction){
            case Constant.UP:    //switch标签必须使用常量==>static final
                System.out.println("向上移动");
                break;
            case Constant.DOWN:
                System.out.println("向下移动");
                break;
            case Constant.LEFT:
                System.out.println("向左移动");
                break;
            case Constant.RIGHT:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("无效的移动方向");
        }
    }
}
