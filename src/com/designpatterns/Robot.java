package com.designpatterns;

abstract class Robot {
    protected WalkableRobot walkableRobot;
    protected TalkableRobot talkableRobot;
    protected FlyableRobot flyableRobot;

    public Robot(WalkableRobot walkableRobot, TalkableRobot talkableRobot, FlyableRobot flyableRobot) {
        this.walkableRobot = walkableRobot;
        this.talkableRobot = talkableRobot;
        this.flyableRobot = flyableRobot;
    }

    public void walk() {
        walkableRobot.walk();
    }

    public void talk() {
        talkableRobot.talk();
    }

    public void fly() {
        flyableRobot.fly();
    }

    public abstract void projection(); // Abstract method for subclasses
}

// ----- Concrete Robot types
class CompanionRobot extends Robot {
    public CompanionRobot(WalkableRobot w, TalkableRobot t, FlyableRobot f) {
        super(w,t,f);
    }

    public void projection() {
        System.out.println("Displaying friendly companion features....");
    }
}

class WorkerRobot extends Robot {
    public WorkerRobot(WalkableRobot w, TalkableRobot t, FlyableRobot f) {
        super(w,t,f);
    }
    public void projection() {
        System.out.println("Displaying worker efficiency stats....");
    }
}
