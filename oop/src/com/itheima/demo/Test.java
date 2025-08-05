package com.itheima.demo;

public class Test {
    public static void main(String[] args) {
        //定义movies数组对象
        Movie[] movies = new Movie[6];
        movies[0] = new Movie(1,"唐顿庄园","维吉尼亚",9.5);
        //生成五部中国电影,放在数组中
        movies[1] = new Movie(2,"战狼","王宝强",8.5);
        movies[2] = new Movie(3,"功夫熊猫","史密斯",9.2);
        movies[3] = new Movie(4,"让子弹飞","沈腾",9.3);
        movies[4] = new Movie(5,"暗潮","姜鹏",7.5);
        movies[5] = new Movie(6,"夏洛特烦恼","渣渣辉",9.8);

        //MovieOperator mo = new MovieOperator(Movie[] movies); 报错，直接传入对象
        //非常重要的一步
        MovieOperator mo = new MovieOperator(movies);
        mo.printAllMovies();
        mo.searchMovieById();
    }
}
