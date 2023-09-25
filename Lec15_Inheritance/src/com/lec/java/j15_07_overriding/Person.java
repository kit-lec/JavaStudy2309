package com.lec.java.j15_07_overriding;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void showInfo(){
        System.out.println("이름: " + name);
    }

    // final 이 메소드 앞에 붙으면
    // 더 이상 오버라이딩 불가!!
    public final void whoAreYou() {
        System.out.println("이름: " + name);
    }
}

//final 이 변수 앞에 붙으면 더이상 변경 불가(상수화)
//final 이 클래스 앞에 붙으면 더이상 상속 불가
//final 이 메소드 앞에 붙으면 더이상 오버라이딩 불가

final class PostPerson extends Person{

}

//class PostBoy extends PostPerson{
//
//}











