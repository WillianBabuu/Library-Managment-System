package com.kilimo.Library.book;

public class Book {
    private Long id;
    private String name;
    private String authur_name;
    private Integer year;

    public Book (){

    }

    public Book(Long id, String name, String authur_name, Integer year){
        this.id = id;
        this.name = name;
        this.authur_name = authur_name;
        this.year = year;
    }

    public Book(String name, String authur_name, Integer year){
        this.name = name;
        this.authur_name = authur_name;
        this.year = year;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public String getAuthurName(){
        return authur_name;
    }

    public void setAuthurName(String authur_name){
        this.authur_name = authur_name;
    }

    public Integer getYear(){
        return year;
    }

    public void setYear(Integer year){
        this.year = year;
    }

    @Override
    public String toString(){
        return "Book {" +
            "id" + id +
            ", name" + name + '/' +
            ", authur_name" + authur_name + '/' +
            ", year" + year +
            "}";
    }
    
}
