package 배열2.자가진단06;

import java.util.Scanner;

/*
85 67 95 65
80 95 86 56
100 98 67 86
95 76 84 65
67 86 90 76

 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] score = new int[5][4];  // 5 x int[4]

        for (int i = 0; i < score.length; i++) {   // i: 학생
            for (int j = 0; j < score[i].length; j++) {  // j: 과목
                score[i][j] = sc.nextInt();
            }
        }

        
        int success = 0;  // 합격(pass) 한 학생수
        
        // 학생별로 점수 계산
        for (int i = 0; i < score.length; i++) {
            int sum = 0;   // i번째 학생 총점

            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
            }

            double avg = (double) sum / score[i].length;  // i번째 학생 평균

            //System.out.println(avg);

            if(avg >= 80){
                System.out.println("pass");
                success++;
            } else {
                System.out.println("fail");
            }
        }
        System.out.println("Successful : " + success);

        sc.close();
    }
}







