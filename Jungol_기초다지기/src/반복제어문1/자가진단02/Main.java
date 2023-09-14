package 반복제어문1.자가진단02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 1 ~ n
        int sum = 0;
        for (int count = 1; count <= n; count++) {
            sum += count;  // 누적합산
        }

        System.out.println(sum);

        sc.close();
    }
}








