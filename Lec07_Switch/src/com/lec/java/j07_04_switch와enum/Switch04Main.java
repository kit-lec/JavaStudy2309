package com.lec.java.j07_04_switch와enum;

public class Switch04Main {

	// enum 타입 정의하는 방법: (enumeration)
	// enum 이름 {}
	// enum 타입 정의 메소드 안에서는 할 수 없다.
	
	enum Days {SUN, MON, TUE, WED, THU, FRI, SAT}   // Days enum 타입 정의

	public static void main(String[] args) {
		System.out.println("enum 타입을 switch에서 사용하기");
		
		Days day1;
		day1 = Days.THU;
		System.out.println(day1);
		System.out.println(day1 + " 목요일이당");

		Days day2 = Days.MON;
//		System.out.println(day2 - day1);  // 산술연산 X
//		System.out.println(day2 > day1);  // 비교연산 X
		System.out.println(day1 == day2);
		System.out.println(day1 == Days.THU);

		Subjects sub1 = Subjects.KOREAN;

		switch (day1){
			case SUN:
				System.out.println("일요일");
				break;

			case MON:
			case TUE:
			case WED:
				System.out.println("주 초반");
				break;
			case THU:
			case FRI:
				System.out.println("주 후반");
				break;
			case SAT:
				System.out.println("주말");
				break;
		}

		System.out.println("\n프로그램 종료");
	} // end main()

} // end class










