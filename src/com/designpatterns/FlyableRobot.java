package com.designpatterns;

public interface FlyableRobot {
    public void fly();
}
class NormalFly implements FlyableRobot {
    public void fly() {
        System.out.println("Flying Normally");
    }
}
class NoFly implements FlyableRobot {
    public void fly() {
        System.out.println("Can't Fly!...");
    }
}
