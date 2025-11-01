package com.designpatterns;

public class AbstractFactory {

    public static void main(String[] args) {
        String burgerType = "basic";
        String garlicBreadType = "cheese";

        MealFactory mf = new PrajBurgers();

        Burger bg =  mf.createBurger(burgerType);
        GarlicBread gf = mf.createGarlicBread(garlicBreadType);

        if(bg != null){
            bg.prepare();
        }
        if(gf != null) gf.prepare();
    }
}
