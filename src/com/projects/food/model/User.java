package com.projects.food.model;

public class User {
    private int userId;
    private String userName;
    private String address;
    private Cart cart;


    public User(int userId, String userName, String address) {
        this.userId = userId;
        this.userName = userName;
        this.address = address;
        this.cart = new Cart();
    }
//    Generating getter and setter

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cart getCart() {
        return cart;
    }


}
