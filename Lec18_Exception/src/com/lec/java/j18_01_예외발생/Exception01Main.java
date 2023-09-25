package com.lec.java.j18_01_예외발생;

import java.util.Scanner;

/* 예외(Exception)
	
	컴파일 에러 : 문법상 오류
	예외(Exception) : 문법상의 오류 가 아닌 '실행중' 에 발생되는 오류상황
	  
	(기본적으로) 예외 가 발생되면, 예외 관련 메세지 출력하고 프로그램이 종료 됩니다.  
 */
public class Exception01Main {

	public static void main(String[] args) {
		System.out.println("예외(Exception)");
		
		System.out.println("[1] ArithmeticException");
		int num1 = 123;
		int num2 = 3;

		// TODO
		
		System.out.println("[2] ArrayIndexOutOfBoundsException");
		int[] numbers = new int[10];
		
		// TODO
		
		System.out.println("[3] NegativeArraySizeException");
		int size = 10;
		
		// TODO
		
		
		System.out.println("[4] NullPointerException(NPE)");
		String str = "Java";
		
		// TODO
		
		System.out.println("[5] InputMismatchException");  
		Scanner sc = new Scanner(System.in);
	
		// TODO
		
		sc.close();
		
		System.out.println("\n프로그램 정상 종료");
	} // end main()

} // enc class Exception01Main











