//GroundVegetable creates via Java-code in ConfigSpring and UndergroundVegetable creates by automatic configuration
//No need in ApplicationContext now
package com.mineorg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigSpring.class);

        context.getBean("garden",Garden.class).setVegetable().plant();

        System.out.println(context.getBean("garden", Garden.class).hashCode());
        System.out.println(context.getBean("garden", Garden.class).hashCode());

        context.close();
    }
}
