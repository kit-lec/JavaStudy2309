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

        // TODO


        System.out.println("프로그램 종료");
    }
}













