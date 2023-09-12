package com.lec.java.j403_nextLine_next;

import java.util.Scanner;

public class Input03Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // > aaa bbb ccc   <- 입력
        System.out.print("여러 단어의 문장을 입력하세요 >");
        String in = sc.nextLine();   // 한 라인 (\n 입력까지) 전체
        System.out.println("in : " + in);     // //  aaa bbb ccc

        System.out.print("여러 단어의 문장을 입력하세요 >");
        String in2 = sc.next();
        System.out.println("in2 : " + in2);

        String in3 = sc.next();
        System.out.println("in3 : " + in3);

        String in4 = sc.next();
        System.out.println("in4 : " + in4);

        // 한 줄로 여러개 숫자 데이터 입력
        System.out.print("숫자 3개 (int, double, short)를 입력받으세요 >");
        int i1 = sc.nextInt();
        double d1 = sc.nextDouble();
        short s1 = sc.nextShort();

        System.out.printf("i1, d1, s1:  %d %f %d\n", i1, d1, s1);



        sc.close();
    }
}



































