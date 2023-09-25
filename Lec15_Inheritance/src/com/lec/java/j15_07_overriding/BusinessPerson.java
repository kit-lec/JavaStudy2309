package com.lec.java.j15_07_overriding;

public class BusinessPerson extends Person{
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    // 메소드 재정의(Overriding)
    // 부모 클래스에 있는 메소드를 다시 정의하는 것.
    // 부모 클래스에 있는 메소드와 매개변수 리스트가 동일해야 함
    // 부모 클래스에 있는 메소드와 접근권한 수식어가 동일할 필요는 없지만,
    // 접근권한의 범위가 축소될 수는 없다.
    // 즉, 접근권한은 같거나 더 넓은 수식어를 사용해야 함.


    @Override
    protected void showInfo() {
    //public void showInfo() {  // 가능
     //void showInfo() {  // 불가능.
        super.showInfo();
        System.out.println("회사: " + company);
    }
    // IntelliJ 에선
    // CTRL + O 를 누르면 Override 진행


//    @Override
//    public void whoAreYou() {
//        super.whoAreYou();
//    }
}










