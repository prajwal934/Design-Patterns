package com.designpatterns;

public class FacoryMethod {
    public static void main(String[] args) {
        String type = "basic";

        BurgerFactors bgs = new PrajBurger();
        Burger bg = bgs.createBurger(type);

        if(bg != null) {
            bg.prepare();
        }
    }
}
