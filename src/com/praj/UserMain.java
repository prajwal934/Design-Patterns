package com.praj;

public class UserMain {
    public static void main(String[] args) {
        UserBalance ub1 = UserBalance.getAmount();
//        System.out.println(ub1.hashCode()); // hashCode() for compare
        UserBalance ub2 = UserBalance.getAmount();
//        System.out.println(ub2.hashCode());
        System.out.println(ub1 == ub2);
    }
}
