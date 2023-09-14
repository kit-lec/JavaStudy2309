package 반복제어문1.형성평가02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cntOdd = 0;
        int cntEven = 0;
        int i;

        while(true){
            i = sc.nextInt();
            if(i == 0) break;

            if(i % 2 == 0) cntEven++;
            else cntOdd++;
        }

        System.out.println("odd : " + cntOdd);
        System.out.println("even : " + cntEven);

        sc.close();
    }
}







