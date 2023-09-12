package com.lec.java.j402_String_char입력;

import java.util.Scanner;

public class Input02Main {
    public static void main(String[] args) {
        // 문자열, char 입력

        Scanner sc = new Scanner(System.in);

        // line 단위 String 입력
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();  // ENTER 를 입력할때까지의 모든 문자들이 문자열(String)로 리턴

        System.out.println("이름은: " + name);

        // char 입력
        // nextChar() <- 이런거 없다!
        System.out.print("성별을 입력하세요 M/F: ");
        char gender = sc.next().charAt(0);
        System.out.println("이름은: " + name + "\n성별은: " + gender);

//		next() 및 nextXXX() 공백 단위(토큰 단위)로 문자열을 읽기
//		nextLine()는 Enter 단위로 문자열 읽기

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        sc.nextLine();  // 숫자입력 받은뒤에 문자열 입력시에는 반드시 nextLine() 등으로 버퍼 비우기

        System.out.print("주소를 입력하세요: ");
        String addr = sc.nextLine();

        System.out.println("나이: " + age + "\n주소: " + addr);


        sc.close();
    }
}














