package 배열1.형성평가04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == -1) break;
        }

        int startIndex = (i >= 3) ? i - 3 : 0;

        for (int j = startIndex; j < i; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        sc.close();
    }
}









