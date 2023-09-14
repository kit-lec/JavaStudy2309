package com.lec.java.j09_01_while순환문;

/*
 * while 순환문
 * 
 * [구문]
 * while(조건식) {
 *    ...
 * }
 * 
 * 조건식이 '참' (true) 인 동안 while 블럭 반복
 * 
 */
public class While01Main {

	public static void main(String[] args) {
		System.out.println("while 반복문");
		
		int count = 1;  // '초기식'
		while(count <= 10){  // '조건식'
			System.out.println(count);
			count++; // '증감식'
		}
		System.out.println("while 종료후: " + count);

		System.out.println();

		System.out.println("\n프로그램 종료");
	} // end main()
	
} // end class While01Main









