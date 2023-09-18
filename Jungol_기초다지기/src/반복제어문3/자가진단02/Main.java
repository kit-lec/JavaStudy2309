package 반복제어문3.자가진단02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
            i
            0   ---> 1
            1   ---> 2
            2  ----> 3
            3  ----> 4
            .
            .

         */

        sc.close();
    }
}










