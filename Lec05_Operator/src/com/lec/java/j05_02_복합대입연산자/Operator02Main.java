package com.lec.java.j05_02_복합대입연산자;

/* 복합 대입 연산자 compound assignment operators
 * 
 * 		+=, -=, *=, /=, %=, ...
 */
public class Operator02Main {

	public static void main(String[] args) {
		System.out.println("연산자(Operator) 2 - 복합 대입 연산자 compound assignment operators");
		System.out.println("+=, -=, *=, /=, %=, ...");

		int num1 = 10;
		System.out.println("num1 = " + num1);
		num1 = num1 + 1;

		System.out.println("num1 = " + num1);
		num1 += 1;

		System.out.println("num1 = " + num1);

		num1 *= 2;
		num1 -= 10;
		num1 /= 2;

		System.out.println("num1 = " + num1);
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class










