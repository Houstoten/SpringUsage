package com.mineorg;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public abstract class Vegetable {
    private String name;
    protected void setName(String name){
        this.name = name;
    }
    @PostConstruct
    private void Inithere(){
        System.out.println("Init of "+ this.getName());
    }
    @PreDestroy
    private void Deletehere(){
        System.out.println("Deletion of "+ this.getName());
    }
    public String getName(){
        return name;
    }
}
