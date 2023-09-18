package 반복제어문3.형성평가03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        // 증가 방향
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 감소방향
        for (int i = 0; i < n - 1; i++) {  // n - 1번 순환
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        sc.close();
    }
}
