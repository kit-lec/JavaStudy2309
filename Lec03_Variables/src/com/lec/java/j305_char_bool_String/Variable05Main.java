package com.lec.java.j305_char_bool_String;

public class Variable05Main {
    public static void main(String[] args) {
        // char: 문자 하나를 저장하기 위한 자료 타입(2바이트)
        // char 는 문자의 코드값(정수)가 담긴다 (2byte)

        char ch1 = 'A';
        // 문자열(String)은 큰따옴표("")로 묶어 줌.   (String literal)
        // 문자 하나(char)는 작은따옴표('')로 묶어 줌.   (char literal)
//        char ch2 = "A";
        System.out.println("ch1: " + ch1);

        char ch2 = '한';
        char ch3 = '글';
        System.out.println("ch2: " + ch2);
        System.out.println("ch3: " + ch3);

        char ch4 = 0xAE01;
        System.out.println("ch4: " + ch4);
        char ch5 = 1234;
        System.out.println("ch5: " + ch5);

        char ch6 = '!';
        System.out.println("ch6: " + ch6);

        char ch7 = 33;
        System.out.println("ch7: " + ch7);
        System.out.println("ch7: " + (int)ch7);

        // 1. "bible"
        // 2. "cable"
        // 3. "able"
        // 오름차순 정렬하면?
        // 3 - 1 - 2

        // 1. "aaAA"
        // 2. "AaAa"
        // 3. "aAaA"
        // 4. "AAaa"
        // 4 - 2 - 3 - 1

        System.out.println((int)'A');
        System.out.println((int)'a');

        System.out.println('z' - 'a' + 1);
        System.out.println('힣' - '가' + 1);


    }
}




