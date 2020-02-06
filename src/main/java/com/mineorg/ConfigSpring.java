package com.mineorg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration @ComponentScan("com.mineorg") @PropertySource("Garden.properties")
public class ConfigSpring {
    @Bean
    public GroundVegetable groundVegetable(@Value("${Ground.name}") String name){
        return GroundVegetable.createGroundVegetable(name);
    }
}
