package com.mineorg;

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
    }
}
