package com.lec.java.j303_정수타입;

/**
 * 자바의 기본 자료형(primitive data type)
 * 정수 타입: byte(1바이트), short(2바이트), int(4바이트), long(8바이트)
 * 실수 타입: float(4바이트), double(8바이트)
 * 문자 타입: char(2바이트)
 * 논리 타입: boolean(1바이트)
 */
public class Variable03Main {
    public static void main(String[] args) {

        System.out.println("byte: " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE );
        byte num1 = -128;
        byte num2 = 0;
        byte num3 = 123;
        //byte num4 = 128;

        System.out.println("short: " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        short num5 = -12345;
        short num6 = 12345;
        // short num7 = 32768;

        System.out.println("int: " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);

        //int num9 = 9876543210;
        //long num10 = 9876543210;  // 헉?

        // 리터럴(literal) : 코드에 직접 입력하는 값.
        // 리터럴도 '타입'이 있다.
        // 자바는 기본적으로
        //   정수타입리터럴을 int 타입으로 인식하려 한다.
        //   실수타입리터럴을 double 타입으로 인식하려 한다.

        long num11 = 9876543210L;  // 정수 리터럴뒤에 L 붙이면 long 타입 리터럴로 인식

        long num12 = 12;  // 12라는 int 값을 long 타입에 저장
        long num13 = 12L;  // 12라는 long 값을 long 타입에 저장
//        int num14 = 12L;

        //double aaa;

        //  코드 추가했어요~~~ 뿌~~~

        // 정수타입은 값의 경계선
        // overflow, underflow 발생
        byte num15 = Byte.MAX_VALUE;  // 127
        byte num16 = (byte)(num15 + 1);
        System.out.println("num15 = " + num15);
        System.out.println("num16 = " + num16);


    }
}












