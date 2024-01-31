package com.kilimo.Library.book;

import org.springframework.stereotype.Service;
@Service
public class Book {
    private Long id;
    private String title;
    private String authur_name;
    private String genre;
    private String description;
    private Integer year;
    private Boolean is_ebook;
    private Boolean is_public;

    public Book (){

    }

    public Book(Long id, String title, String authur_name, String genre, String description, Integer year, Boolean is_ebook, Boolean is_public){
        this.id = id;
        this.title = title;
        this.authur_name = authur_name;
        this.genre = genre;
        this.description = description;
        this.year = year;
        this.is_ebook = is_ebook;
        this.is_public = is_public;
    }

    public Book(String title, String authur_name, String genre, String description, Integer year, Boolean is_ebook, Boolean is_public){
        this.title = title;
        this.authur_name = authur_name;
        this.genre = genre;
        this.description = description;
        this.year = year;
        this.is_ebook = is_ebook;
        this.is_public = is_public;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    
    public String getAuthurName(){
        return authur_name;
    }

    public void setAuthurName(String authur_name){
        this.authur_name = authur_name;
    }

    public String getGenre(){
        return genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public Integer getYear(){
        return year;
    }

    public void setYear(Integer year){
        this.year = year;
    }
    public Boolean getIsEbook(){
        return is_ebook;
    }

    public void setIsEbook(Boolean is_ebook){
        this.is_ebook = is_ebook;
    }
    public Boolean getIsPublic(){
        return is_public;
    }

    public void setIsPublic(Boolean is_public){
        this.is_public = is_public;
    }

    @Override
    public String toString(){
        return "Book {" +
            "id" + id +
            ", title" + title + '/' +
            ", authur_name" + authur_name + '/' +
            ", genre" + genre + '/' +
            ", description" + description + '/' +
            ", year" + year +
            ", is_ebook" + is_ebook +
            ", is_public" + is_public +
            "}";
    }
    
}
