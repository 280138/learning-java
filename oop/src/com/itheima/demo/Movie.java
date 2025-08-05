package com.itheima.demo;

public class Movie {
    private int id;
    private String name;
    private String director;
    private double price;

    public Movie() {
    }

    public Movie(int id, String name, String director, double price) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
