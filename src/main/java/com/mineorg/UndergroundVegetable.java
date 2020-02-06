package com.mineorg;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UndergroundVegetable extends Vegetable {
//    public UndergroundVegetable(String name) {
//        super.setName(name);
//    }
//    @Bean
//    public static UndergroundVegetable createUndergroundVegetable(String name){//factorymethod
//        return new UndergroundVegetable(name);
//    }

    @Override
    public String getName() {
        //return super.getName();
        return "potato";
    }
}
