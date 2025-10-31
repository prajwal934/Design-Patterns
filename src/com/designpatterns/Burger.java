package com.designpatterns;
// -- Burger Interface---
public interface Burger {
    void prepare();
}

//-- Concrete Burger Implementation

class BasicBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Basic Burger with bun");
    }
}

class StandardBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Standard Burger with bun, patty, ketchup!");
    }
}

class PremiumBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Premium Burger with bun, premium patty, cheese, and secret sauce!");
    }
}
