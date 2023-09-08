package com.lec.java;

/*
    블럭 주석 (block comment)

 */

/*모든 자바 프로그램은 main() 메소드로부터 '시작'한다
        프로그램 실행순서는 '시작' 부터 한 문장(Statement) 씩 실행되는 것이 원칙
        문장의 끝은 반드시 세미콜론 ';' 으로 마무리 해야 한다*/

public class FirstJava {
    public static void main(String[] args) {
        // 라인 주석 (line comment)
        System.out.println("My First Java APP");
// 프로그램 실행과는 상관 없지만,
// 개발자가 프로그램을 작성할 때 설명을 달아주는 것.

        System.out.println(123);   // 숫자 123
        System.out.println("123");   // "문자열" "123"

        System.out.println((10 + 20));  // 숫자 + 숫자 => 산술연산
        System.out.println("10 + 20");

        System.out.println(3.141592 * 10 * 10);
        System.out.println(10 * 10 / 2);

        System.out.println("안녕하세요" + "여러분"); // "문자열" + "문자열" => "연결된 문자열"

        // "문자열" + 숫자 => 문자열
        //           ↓ 문자열 변환
        // "문자열" + "숫자" => 문자열

        System.out.println("결과: " + 10);
        System.out.println("결과: " + 10 + 20);
        System.out.println("결과: " + (10 + 20));

        // 사칙연산
        System.out.println("10 + 20 = " + (10 + 20));
        System.out.println("10 - 20 = " + (10 - 20));
        System.out.println("10 * 20 = " + (10 * 20));
        System.out.println("10 / 20 = " + (10 / 20)); // 정수 와 정수 연산 결과는 정수 (즉 소수점이하 절삭)

        System.out.println("10 / 20 = " + ((double)10 / 20));  // 실수 와의 연산 결과는 실수

        // print()  <- 줄바꿈 안함
        System.out.print("안녕");
        System.out.print("하세요");

        System.out.println();

        // 이스케이프 문자 (escape character)
        // " ~ " 문자열 안에서 특수 문자 출력


        // She says "Hi"  <-- 출력하려면?
//        System.out.println("She says "Hi"");  // 에러다!
        System.out.println("She says \"Hi\"");

        // 입문시 기억할만한 이스케이프 문자
        // \"  : 쌍따옴표
        // \n  : 줄바꿈
        // \t  : 탭문자
        // \\  : 문자열 안에서 역슬래시 출력

        System.out.println("123\t456\t7890");
        System.out.println("12\t34\t56\t78\t90");
        System.out.println("12345\t678\n90");



        System.out.println("프로그램 종료");
    }
}













