package com.itheima.demo;

import java.util.Scanner;

public class MovieOperator {

    private Movie[] movies;

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    public void printAllMovies(){
        System.out.println("编号\t" + "电影名称\t" + "导演\t" + "价格");
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i].getId() + "\t" + movies[i].getName() + "\t" + movies[i].getDirector() + "\t" + movies[i].getPrice());
        }
    }

    //根据ID查询电影
    public void searchMovieById() {
        System.out.println("请输入要查询的ID：");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            if (id == movies[i].getId()) {
                Movie m = movies[i];
                System.out.println(m.getId() + "\t" + m.getName() + "\t" + m.getDirector() + "\t" + m.getPrice());
                return;
            }
        }
        System.out.println("没有找到该ID对应的电影");
    }
}
