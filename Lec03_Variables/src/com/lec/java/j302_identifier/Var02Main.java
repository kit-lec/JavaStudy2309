package com.lec.java.j302_identifier;
/*
    변수명 등 사용자가 이름을 지어준것들 --> 식별자 (identifier) 라고 함.

    식별자 수정할때는 refactor 기능을 활용하자.
 */

public class Var02Main {
    public static void main(String[] args) {
        int number;

        // 선언과 동시에 초기화
        int num1 = 10;

        // 여러 변수 동시 선언
        int a, b, c;

        int korean = 50, english = 67, mathematics = 34;

        System.out.println("국어점수: " + korean);
        System.out.println("영어점수: " + english);
        System.out.println("수학점수: " + mathematics);

        // 총점
        int total = korean + english + mathematics;
        System.out.println("총점: " + total);

        // 평균
        System.out.println("평균: " + ((double)total / 3));

        // 변수명 바꿀때는 refactor-rename 사용하자!   SHIFT+F6

        // 변수명 (식별자) 작명 제약사항.
        // 알파벳, 숫자, _, $
        // 숫자로 시작하면 안됨
        // 띄어쓰기 안됨
        // 대소문자 구분
        // 중복 안됨.
        int abc;

        //int abc;

        int Abc;

        double year2020;
//        double 2020year;

        int myLittleToy;   // 일반적으론 camel-notation 으로 작명하는게 관례
        int my_little_toy;
        int _my_toy_;
        int $aa;

    }
}













