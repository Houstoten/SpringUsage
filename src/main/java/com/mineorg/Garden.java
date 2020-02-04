package com.mineorg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Garden {
    private List<Vegetable> vegetables = new ArrayList<>();
    private int count = 1;
//    public Garden(Vegetable vegetable) {
//        this.vegetable = vegetable;
//    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setVegetable(Vegetable... vegetable) {
        //this.vegetables.add(vegetable);
        Collections.addAll(this.vegetables, vegetable);
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
