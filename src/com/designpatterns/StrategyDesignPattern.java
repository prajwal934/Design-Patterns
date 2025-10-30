package com.designpatterns;

public class StrategyDesignPattern {
    public static void main(String[] args) {
        Robot r1 = new CompanionRobot(new NormalWalk(), new NormalTalk(), new NoFly());
        r1.walk();
        r1.talk();
        r1.fly();
        r1.projection();

        System.out.println("....._____________________________......");

        Robot r2 = new WorkerRobot(new NoWalk() , new NoTalk(), new NormalFly());
        r2.walk();
        r2.talk();
        r2.fly();
        r2.projection();
    }
}
