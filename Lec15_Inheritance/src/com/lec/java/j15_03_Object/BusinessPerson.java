package com.lec.java.j15_03_Object;

public class BusinessPerson extends Person {

    String company;

    public void showInfo(){
        whoAmI();
        System.out.println("회사는 " + company + " 입니다");
    }
}










