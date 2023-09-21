package com.lec.java.j13_03_getter_setter;

public class Number {

    // 멤버변수 (필드)
    private int num;

    // 디폴트 생성자
    public Number() {}

    // 매개변수 있는 생성자
    public Number(int num){
        this.num = num; // this : 자기자신(인스턴스)을 가리킴
    }

    // 메소드
    // getter: 멤버 변수의 값을 리턴해 주는 메소드
    // setter: 멤버 변수의 값을 변경해 줄 수 있는 메소드

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        if(num <= 0) return;
        this.num = num;
    }

    // getter & setter 작명
    // age => getAge
    //     => setAge

    // realNumber => getRealNumber
    //            => setRealNumber

    // age 읽기 property.
    public int getAge(){
        return 34;
    }


}








