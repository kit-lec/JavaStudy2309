package com.lec.java.j16_01_Polymorphism;

public class Vehicle {
    // 멤버 변수:
    private int speed;

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("--- Vehicle 정보 ---");
        System.out.println("speed: " + speed);
    }


}
