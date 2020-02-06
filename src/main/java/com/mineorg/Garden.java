package com.mineorg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
public class Garden {
    private List<Vegetable> vegetables = new ArrayList<>();
    private int count = 1;

    public void setCount(int count) {
        this.count = count;
    }
    @Autowired
    public Garden setVegetable(Vegetable... vegetable) {
        //this.vegetables.add(vegetable);
        Collections.addAll(this.vegetables, vegetable);
        return this;
    }

    public void plant() {
        for (Vegetable vegetable : vegetables) {
            if (count == 1) {
                System.out.println("Planting " + vegetable.getName());
            } else {
                System.out.println("Planting " + count + " " + vegetable.getName() + "s");
            }
        }
    }
}
