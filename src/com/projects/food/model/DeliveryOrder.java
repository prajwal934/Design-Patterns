package com.projects.food.model;

public class DeliveryOrder extends Order {
    private String userAddress;

    public DeliveryOrder() {
        userAddress = "";
    }
    @Override
    public String getType() {
        return "Delivery";
    }

    public void setUserAddress(String addre) {
        userAddress = addre;
    }
    public String getUserAddress() {
        return userAddress;
    }
}
