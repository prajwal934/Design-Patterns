package com.projects.food.model;

public class PickupOrder extends Order {
    private String restaurantAddress;

    public PickupOrder() {
        restaurantAddress = " ";
    }
    @Override
    public String getType() {
        return "Pickup";
    }
    public void setRestaurantAddress(String addre) {
        restaurantAddress = addre;
    }
    public String getRestaurantAddress() {
        return restaurantAddress;
    }
}
