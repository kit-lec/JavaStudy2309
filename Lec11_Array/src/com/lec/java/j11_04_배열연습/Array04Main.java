package com.lec.java.j11_04_배열연습;

/* 연습
 * 길이 5개 int 형 배열을 선언하고
 * 사용자로부터 5개 정수를 입력받아 초기화 한뒤 
 * 
 * 총점, 평균, 최대값, 최소값  출력해보기
 */
public class Array04Main {

	public static void main(String[] args) {
		System.out.println("배열 연습");

		int[] score = new int[]{45, 67, 89, 32, 50};




		int total = 0;
		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}
		double avg = (double) total / score.length;
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);

		// 최댓값, 최솟값
		int max = score[0];
		int min = score[0];

		for (int i = 1; i < score.length; i++) {
			if(score[i] > max) max = score[i];
			if(score[i] < min) min = score[i];
		}

		System.out.println("최댓값 = " + max);
		System.out.println("최솟값 = " + min);


		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class Array04Main








