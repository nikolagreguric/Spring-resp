package com.academy.Spring.repo;

public class Person {
    private int id;
    private String names;


    public int getId(){
        return this.id;
    }
    public String getNames(){
        return names;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setNames(String names){
        this.names = names;
    }
}
