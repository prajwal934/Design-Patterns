package com.projects.food.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private static int nextRestaurantId = 0;
    private int resId;
    private String resName;
    private String resLoc;
    private List<MenuItem> menu = new ArrayList<>();

    public Restaurant(String resName, String resLoc) {
        this.resName = resName;
        this.resLoc = resLoc;
        this.resId = ++nextRestaurantId;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public String getResLoc() {
        return resLoc;
    }

    public void setResLoc(String resLoc) {
        this.resLoc = resLoc;
    }

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    public List<MenuItem> getMenu() {
        return menu;
    }


}
