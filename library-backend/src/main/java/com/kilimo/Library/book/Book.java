package com.kilimo.Library.book;

import java.time.LocalDate;
import org.springframework.stereotype.Service;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table

@Service
public class Book {
    @Id
    @SequenceGenerator(
        name = "book_sequence",
        sequenceName = "book_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "book_sequence"
    )
    private Long id;
    private String title;
    private String authur_name;
    private String genre;
    private String description;
    private Integer year;
    private Boolean is_ebook;
    private Boolean is_public;
    private LocalDate created_at;
    private LocalDate updated_at;

    public Book (){

    }

    public Book(Long id, String title, String authur_name, String genre, String description, Integer year, Boolean is_ebook, Boolean is_public, LocalDate created_at, LocalDate updated_at){
        this.id = id;
        this.title = title;
        this.authur_name = authur_name;
        this.genre = genre;
        this.description = description;
        this.year = year;
        this.is_ebook = is_ebook;
        this.is_public = is_public;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Book(String title, String authur_name, String genre, String description, Integer year, Boolean is_ebook, Boolean is_public, LocalDate created_at, LocalDate updated_at){
        this.title = title;
        this.authur_name = authur_name;
        this.genre = genre;
        this.description = description;
        this.year = year;
        this.is_ebook = is_ebook;
        this.is_public = is_public;
        this.created_at = created_at;
        this.updated_at = updated_at;
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

    public LocalDate getCreatedAt(){
        return created_at;
    }

    public void setCreatedAt(LocalDate created_at){
        this.created_at = created_at;
    }

    public LocalDate getUpdatedAt(){
        return updated_at;
    }

    public void setUpdatedAt(LocalDate updated_at){
        this.updated_at = updated_at;
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
