package com.designpatterns;

interface BurgerFactors {
    Burger createBurger(String type);
}

class PrajBurger implements BurgerFactors {
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
}

class KingBurger implements BurgerFactors {
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
}
