package com.mineorg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class GroundVegetable extends Vegetable {//Cucumber

//    public GroundVegetable(String name) {
//        super.setName(name);
//    }
//    @Bean
//    public static GroundVegetable createGroundVegetable(String name){//factorymethod
//        return new GroundVegetable(name);
//    }
    @Override
    public String getName() {
       // return super.getName();
        return "cucumber";
    }
}
