package com.designpatterns;

// Strategy Interface for walk
public interface WalkableRobot {
    public void walk();
}

// --- Concrete Strategies for walk---
class NormalWalk implements WalkableRobot {
    public void walk() {
        System.out.println("Walking normally!....");
    }
}
class NoWalk implements WalkableRobot {
    public void walk() {
        System.out.println("Can't Walk");
    }
}
