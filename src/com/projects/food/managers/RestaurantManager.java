package com.projects.food.managers;

import com.projects.food.model.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {
    private List<Restaurant> restaurants = new ArrayList<>();
    private static  RestaurantManager instance = null;

    private RestaurantManager() {}

    public static RestaurantManager getInstance() {
        if(instance == null) {
            instance = new RestaurantManager();
        }
        return instance;
    }

    public void addRestaurant(Restaurant res) {
        restaurants.add(res);
    }

    public List<Restaurant> searchByLocation(String loc) {
        List<Restaurant> result = new ArrayList<>();
        loc = loc.toLowerCase();
        for(Restaurant res :  restaurants) {
            String r1 = res.getResLoc().toLowerCase();
            if(r1.equals(loc)) {
                result.add(res);
            }
        }
        return result;
    }
}
