package com.lec.java.j16_01_Polymorphism;

public class HybridCar extends Car{
    // 멤버 변수:
    private int electricity;

    public int getElectricity() {
        return electricity;
    }

    public void setElectricity(int electricity) {
        this.electricity = electricity;
    }

    @Override
    public void displayInfo() {
        System.out.println("--- HybridCar 정보 ---");
        System.out.println("speed: " + getSpeed());
        System.out.println("oil: " + getOil());
        System.out.println("electricity: " + electricity);
    }
}








