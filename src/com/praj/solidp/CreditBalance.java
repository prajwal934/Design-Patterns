package com.praj.solidp;

public class CreditBalance {

//     By Eager way to achieve singleton
    private static CreditBalance creditBalance = new CreditBalance();

    public static CreditBalance getCreditBalance() {
        return creditBalance;
    }
}
