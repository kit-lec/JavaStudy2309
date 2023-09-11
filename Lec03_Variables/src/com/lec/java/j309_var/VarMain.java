package com.lec.java.j309_var;

/*  Local-Variable Type Inference  (Java10 이상)
    지역변수 타입 추론 : var 키워드 로 변수 선언
    컴파일러가 '타입'을 추론함

    https://openjdk.org/jeps/286

    제약사항
        1. 지역변수에만 사용!
        2. 반드시 초기화 필요.
        3. null 초기화 불가
        4. 배열에는 사용 불가
        5. lambda  에 사용 가능 (Java11 부터)
 */
public class VarMain {
    public static void main(String[] args) {
        var str1 = "Hello World";   // str1 은 String 타입

        var num1 = 100;
        var num2 = 3.14;
        var num3 = 100.45f;
        var num4 = 1234L;
        var num5 = (short)100;
    }
}














