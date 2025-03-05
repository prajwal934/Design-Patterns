package com.praj;

public class UserBalance {

    private static UserBalance amount;
//    create constructor
    private UserBalance() {
        System.out.println("user amount created successfully!");
    }
// lazy way of creating singleton
    public  static UserBalance getAmount() {
//        Object of this
//        Using synchronized  // after thread1 complete then thread2 work
        if(amount == null) {
            synchronized (UserBalance.class) {
                if(amount == null) {
                    amount = new UserBalance();
                }
            }
        }
        return amount;
    }
}
// create field to store object is private