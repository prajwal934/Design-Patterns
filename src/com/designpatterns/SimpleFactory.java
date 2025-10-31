package com.designpatterns;

public class SimpleFactory {
    public static void main(String[] args) {
        String type="premium";

        BurgerFactory bgy = new BurgerFactory();

        Burger bg = bgy.createBurger(type);

        if(bg != null) {
            bg.prepare();
        }
    }
}
