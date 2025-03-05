package com.praj;

public class UserBalance {

    private static UserBalance amount;
//    create constructor
    private UserBalance() {
        System.out.println("user amount created successfully!");
    }
// lazy way of creating singleton
    public static UserBalance getAmount() {
//        Object of this class
        if(amount == null) {
//            Object created with the help of method
            amount = new UserBalance();
        }
        return amount;
    }
}
// create field to store object is private