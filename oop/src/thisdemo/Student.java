package thisdemo;

public class Student {
    String name;
    public void print(){
        //this是一个变量，在方法中用于拿到当前对象
        System.out.println(this);
        System.out.println(this.name);
    }

    public void print2(String name){
        System.out.println(this.name + "喜欢" +"唱歌");
    }
}
