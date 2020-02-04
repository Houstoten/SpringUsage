package com.mineorg;

public class UndergroundVegetable extends Vegetable {
    private UndergroundVegetable(String name) {
        super.setName(name);
    }
    public static UndergroundVegetable createUndergroundVegetable(String name){//factorymethod
        return new UndergroundVegetable(name);
    }
    @Override
    public String getName() {
        return super.getName();
    }
}
