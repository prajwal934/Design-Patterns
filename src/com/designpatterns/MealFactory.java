package com.designpatterns;

interface MealFactory {
    Burger createBurger(String type);
    GarlicBread createGarlicBread(String type);
}

class PrajBurgers implements MealFactory {
    public Burger createBurger(String type) {
        if(type.equalsIgnoreCase("basic")) {
            return new BasicBurger();
        } else if(type.equalsIgnoreCase("standard")) {
            return new StandardBurger();
        } else if (type.equalsIgnoreCase("premium")) {
            return new PremiumBurger();
        } else {
            System.out.println("Invalid Burger!");
            return null;
        }
    }

    public GarlicBread createGarlicBread(String type) {
        if(type.equalsIgnoreCase("basic")) {
            return new BasicGarlicBread();
        } else if(type.equalsIgnoreCase("cheese")) {
            return new CheeseGarlicBread();
        } else {
            System.out.println("Invalid Garlic Bread type!");
            return null;
        }
    }
}

class KingBurgers implements MealFactory {
    public Burger createBurger(String type) {
        if(type.equalsIgnoreCase("basic")) {
            return new BasicWheatBurger();
        } else if(type.equalsIgnoreCase("standard")) {
            return new StandardWheatBurger();
        } else if (type.equalsIgnoreCase("premium")) {
            return new PremiumWheatBurger();
        } else {
            System.out.println("Invalid Burger!");
            return null;
        }
    }

    public GarlicBread createGarlicBread(String type) {
        if(type.equalsIgnoreCase("basic")) {
            return new BasicWheatGarlicBread();
        } else if(type.equalsIgnoreCase("cheese")) {
            return new CheeseWheatGarlicBread();
        } else {
            System.out.println("Invalid Garlic Bread type!");
            return null;
        }
    }
}
