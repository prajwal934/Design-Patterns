package com.praj;

import java.lang.reflect.Constructor;

public class UserMain {
    public static void main(String[] args)  throws Exception{
       /* UserBalance ub1 = UserBalance.getAmount();
//        System.out.println(ub1.hashCode()); // hashCode() for compare
        UserBalance ub2 = UserBalance.getAmount();
//        System.out.println(ub2.hashCode());
        System.out.println(ub1 == ub2);

//
        CreditBalance cd1 = CreditBalance.getCreditBalance();
        System.out.println(cd1.hashCode());
        CreditBalance cd2 = CreditBalance.getCreditBalance();
        System.out.println(cd2.hashCode());*/

//        How to break the singleton pattern
        /*
        * 1. Reflection API to break Singleton pattern
        *       solution: if object is there, then throw Exception from inside constructor
        * 2. Use Enum
        *
        *
        *
        *
        *
        * */
        UserBalance usb1 = UserBalance.getAmount();
        System.out.println(usb1.hashCode());
// After the creation of ENUM, to break the singleton pattern
        UserDebitBalance usd = UserDebitBalance.AMOUNT;
        System.out.println(usd.hashCode());

        Constructor<UserBalance> cons = UserBalance.class.getDeclaredConstructor();
        cons.setAccessible(true); // change private method to public
        UserBalance usb2 = cons.newInstance();
        System.out.println(usb2.hashCode());


    }
}
