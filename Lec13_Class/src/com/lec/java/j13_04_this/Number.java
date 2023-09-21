package com.lec.java.j13_04_this;

public class Number {
    private int num = 100;  // 멤버변수 선언시 초깃값 명시 가능.

    public Number() {
    }

    public Number(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Number add(Number x){
        this.num += x.num;
        return this;
    }

    public Number sub(Number x){
        this.num -= x.num;
        return this;
    }

}









