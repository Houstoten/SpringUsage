package com.mineorg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class GroundVegetable extends Vegetable {//Cucumber

    private GroundVegetable(String name) {
        super.setName(name);
    }
    public static GroundVegetable createGroundVegetable(String name){//factorymethod
        return new GroundVegetable(name);
    }
    @Override
    public String getName() {
        return super.getName();
        //return "cucumber";
    }
}
