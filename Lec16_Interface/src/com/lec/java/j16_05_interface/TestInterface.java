package com.lec.java.j16_05_interface;

public interface TestInterface {
    public static final int MIN = 0;
    int MAX = 100;  // public static final 생략
    
    public abstract void testAAA();
    void testBBB();   // public abstract 생략 가능
}

interface TestInterface2 {
    public static final int MIN = 1;
    public abstract void testAAA();
    public abstract void testCCC();
}


// 인터페이스는 인스턴스를 생성할 수 없고,
// 다른 클래스에서 구현(implements)해야 함.
class TestImpl implements TestInterface {

    @Override
    public void testAAA() {
        System.out.println("AAA");
    }

    @Override
    public void testBBB() {
        System.out.println("BBB");
    }
}

// 인터페이스는 다중상속 가능!
class TestImpl2 implements TestInterface, TestInterface2 {

    // testAAA() 는 두개의 인터페이스 양쪽에 있었지만
    // 한번만 implement 하면 된다


    @Override
    public void testAAA() {
        System.out.println("testAAA");
    }

    @Override
    public void testBBB() {
        System.out.println("testBBB");
    }

    @Override
    public void testCCC() {
        System.out.println("testCCC");
    }
}










