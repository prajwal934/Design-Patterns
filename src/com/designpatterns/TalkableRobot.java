package com.designpatterns;

public interface TalkableRobot {
    public void talk();
}
class NormalTalk implements TalkableRobot {
    public void talk() {
        System.out.println("Talking Normally!...");
    }
}
class NoTalk implements TalkableRobot {
    public void talk() {
        System.out.println("Can't talk");
    }
}
