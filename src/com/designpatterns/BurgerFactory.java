package com.designpatterns;

public class BurgerFactory {
    public Burger createBurger(String type) {
        if(type.equalsIgnoreCase("basic")) {
            return new BasicBurger();
        } else if (type.equalsIgnoreCase("standard")) {
            return new StandardBurger();
        } else if (type.equalsIgnoreCase("premium")) {
            return new PremiumBurger();
        } else {
            System.out.println("Invalid Burger Input, Please Order Something!");
            return  null;
        }
    }
}
