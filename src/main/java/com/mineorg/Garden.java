package com.mineorg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Component @Scope("prototype")
public class Garden {
    private List<Vegetable> vegetables = new ArrayList<>();
    private int count = 1;
    @Autowired
    public void setCount(@Value("${Garden.maxcount}") int count) {
        this.count = Math.abs(count);
    }
    @Autowired
    public Garden setVegetable(/*@Qualifier("undergroundVegetable") To qualify */Vegetable... vegetable) {
        //this.vegetables.add(vegetable);
        Collections.addAll(this.vegetables, vegetable);
        return this;
    }

    public void plant() {
        for (Vegetable vegetable : vegetables) {
            this.count = new Random().nextInt(count);
            if (count == 1) {
                System.out.println("Planting " + vegetable.getName());
            } else {
                System.out.println("Planting " + count + " " + vegetable.getName() + "s");
            }
        }
    }
}
