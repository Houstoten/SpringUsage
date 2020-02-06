package com.mineorg;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class Vegetable {
    private String name;
    protected void setName(String name){
        this.name = name;
    }

//    private void Inithere(){
//        System.out.println("Init of "+ this.getName());
//    }
//    private void Deletehere(){
//        System.out.println("Deletion of "+ this.getName());
//    }
    public String getName(){
        return name;
    }
}
