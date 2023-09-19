package com.lec.java.j12_03_메소드연습;

import java.util.Scanner;

/* 메소드 연습
 * 국어, 영어, 수학 점수를 입력 받아서
 * 총점, 평균, 학점을 출력하는 프로그램
 * 
 * 총점, 평균, 학점을 구하는 각각의 메소드들을 작성하여 프로그램 완성하기
 * 
 *  [입력예]
 *  78 98 57
 *  
 *  [출력예]
 *  총점: 233
 *  평균: 77.66666666666667
 *  학점: C
 */
public class Method03Main {
	
	public static void main(String[] args) {
		System.out.println("메소드 연습");

		// 국어, 영어, 수학 점수를 위한 int 변수를 선언
		int kor, eng, math;
		
		// 키보드를 통해서 점수를 입력 받고 저장
		Scanner sc = new Scanner(System.in);

		kor = 88; eng = 76; math = 59;
		
		sc.close();
		
		// calcTotal() 메소드를 정의+호출 하여 총점 계산하고 출력
		int total = calcTotal(kor, eng, math);
		System.out.println("총점: " + total);
		
		
		// calcAvg() 메소드를 정의+호출 하여 평균 계산하고 출력
		double avg = calcAvg(total);
		System.out.println("평균: " + avg);
		
		
		// calcGrade() 메소드를 정의+호출 하여 학점(A, B, C, D, F)을 출력
		// 평균 90 이상이면 A, 80 이상이면 B, 70 이상이면 C, 60 이상이면 D
		// 나머지는 F
		char grade = calcGrade(avg);
		System.out.println("학점: " + grade);

		System.out.println("학점: " + calcGrade(calcAvg(calcTotal(kor, eng, math))));

		
		
		System.out.println("\n프로그램 종료");
	} // end main()

	// calcTotal
	// 기능: 국어, 영어, 수학 점수를 입력 받아서 총점을 리턴하는 메소드
	// return: int
	// method name: calcTotal
	// arguments:
	//   1) int kor: 국어 점수
	//   2) int eng: 영어 점수
	//   3) int math: 수학 점수
	public static int calcTotal(int kor, int eng, int math){
		return kor + eng + math;
	}
	
	// calcAvg
	// 기능: 총점을 입력받아서 평균을 리턴하는 메소드
	// return: double
	// method name: calcAvg
	// arguments: int total - 총점
	public static double calcAvg(int total){
		return (double) total / 3;
	}
	
	
	// calcGrade
	// 기능: 평균을 받아서 등급을 리턴하는 메소드
	//      평균 90 이상이면 'A', 80 이상이면 'B', 70 이상이면 'C', 60 이상이면 'D'
	//      나머지는 'F' 리턴
	// return: char
	// method name: calcGrade
	// arguments: double avg - 평균
	public static char calcGrade(double avg){
//		char grade;
//		if (avg >= 90) {
//			grade = 'A';
//		} else if (avg >= 80) {
//			grade = 'B';
//		} else if (avg >= 70) {
//			grade = 'C';
//		} else if (avg >= 60) {
//			grade = 'D';
//		} else {
//			grade = 'F';
//		}
//
//		return grade;

		// return 을 사용한 간결한 코드
//		if(avg >= 90) return 'A';
//		if(avg >= 80) return 'B';
//		if(avg >= 70) return 'C';
//		if(avg >= 60) return 'D';
//		return 'F';

		// switch expression
		return switch((int)(avg / 10)){
			case 9 -> 'A';
			case 8 -> 'B';
			case 7 -> 'C';
			case 6 -> 'D';
			default -> 'F';
		};


	}
	
	
	
} // end class








