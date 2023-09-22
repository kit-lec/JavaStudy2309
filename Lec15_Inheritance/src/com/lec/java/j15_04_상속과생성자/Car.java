package com.lec.java.j15_04_상속과생성자;

public class Car extends Vehicle {

    // 멤버 변수:
    int oil;

    // 생성자
    public Car() {
        // 부모클래스의 기본생성자 호출 --> Vehicle()
        // 명시적으로 super() 가 없으면 기본적으로 부모의 기본생성자 호출
        //super(100);
        System.out.println("Car() 생성");
    }

    public Car(int oil){
        super();   // super 는 반드시 첫번째 문장이어야 한다
        System.out.println("Car(int) 생성 : oil=" + oil);
        this.oil = oil;
    }

    public Car(int speed, int oil) {
        super(speed); // 부모클래스의 매개변수가 있는 생성자를 직접 호출
        this.oil = oil;
        System.out.println("Car(int,int) 생성: speed=" + speed
                + "oil=" + oil);
    }

}











