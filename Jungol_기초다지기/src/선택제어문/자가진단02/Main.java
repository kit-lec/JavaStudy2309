package 선택제어문.자가진단02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 키, 몸무게
        int height = sc.nextInt();
        int weight = sc.nextInt();

        // 비만수치
        int obesity = weight + 100 - height;

        // 비만수치 출력
        System.out.println(obesity);

        // 비만여부 판정
        if(obesity > 0)
            System.out.println("Obesity");


        sc.close();
    }
}










