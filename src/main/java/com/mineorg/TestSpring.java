package com.mineorg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        Vegetable firstvegetable = context.getBean("undergroundBean", Vegetable.class);
//        Vegetable secondvegetable = context.getBean("groundBean", Vegetable.class);
//        new Garden(context.getBean("undergroundBean", Vegetable.class)).plant();
//        new Garden(context.getBean("groundBean", Vegetable.class)).plant();

       // Vegetable under = context.getBean("undergroundVegetable", Vegetable.class);
        context.getBean("garden",Garden.class).setVegetable().plant();
        //Garden garden = new Garden();
       // garden.setVegetable(under);
       // garden.plant();
//        System.out.println(context.getBean("gardenBean", Garden.class).hashCode());
//        System.out.println(context.getBean("gardenBean", Garden.class).hashCode());

        context.close();
    }
}
