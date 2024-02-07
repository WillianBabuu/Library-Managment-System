package com.kilimo.Library.category;

public class Category {
    private Long id;
    private String name;
    private int parent_id;

    public Category(){

    }
    public Category(Long id, String name, int parent_id){
        this.id=id;
        this.name=name;
        this.parent_id=parent_id;
    }
    public Category(String name, int parent_id){
        this.name=name;
        this.parent_id=parent_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parent_id;
    }

    public void setParentId(int parent_id) {
        this.parent_id = parent_id;
    }

    @Override
    public String toString(){
        return "Category{" +
                "id="+ id + 
                ", name='"+ name +'\'' +
                ", parent_id=" + parent_id 
                ;}
    

}
