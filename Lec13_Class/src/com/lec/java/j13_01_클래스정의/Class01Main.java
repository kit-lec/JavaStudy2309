package com.lec.java.j13_01_클래스정의;

/*
 	클래스 정의 및 사용
 	
 	우리가 만든 클래스를 사용하려면,
	그 클래스의 '인스턴스(실체 instance)'를 생성해야 함.
	
	구문
		클래스이름 변수이름 = new 생성자();
		생성자(): 클래스의 이름과 동일, 클래스의 멤버변수들을 초기화
		
 	new 로 생성하는 instance 들은
 	지역변수와는 달리 인스턴스가 생성될 때 (자동으로) 초기화가 된다.
 	특별히 초기화를 할 값들이 지정되어 있지 않을 때는
 	각 변수 타입의 기본값(디폴트 값)으로 초기화가 됨
 		boolean -> false, 숫자타입(int, double, ...) -> 0
 		String, 참조 타입(클래스) -> null
 	
 	지역변수: 메소드 안에서 선언된 변수
 	지역변수는 사용하기 전에 반드시 초기화를 해줘야 함.
 */
public class Class01Main {

	public static void main(String[] args) {
		System.out.println("클래스 생성 & 사용");
		
		MyTV tv1 = new MyTV();

//		tv1.volume = 32;
//		tv1.channel = 14;
//		tv1.isPowerOn = true;
		tv1.displayStatus();

		System.out.println(tv1);

		tv1.powerOnOff();
		tv1.volumeUp();
		tv1.volumeUp();
		tv1.channelUp();

		tv1.displayStatus();

		System.out.println();
		MyTV tv2 = new MyTV();

		tv2.powerOnOff();
		tv2.channelUp();
		tv2.volumeUp();
		tv2.volumeUp();

		tv2.displayStatus();

		System.out.println("tv1: " + tv1);
		System.out.println("tv2: " + tv2);
		System.out.println(tv1 == tv2); // 객체 참조변수간 ==, != 비교는 참조(주소) 비교

		tv1 = tv2;  // 참조(주소)복사 발생!!
		tv1.displayStatus();

		tv1.powerOnOff();
		tv2.displayStatus();

		System.out.println("tv1: " + tv1);
		System.out.println("tv2: " + tv2);
		System.out.println(tv1 == tv2);



		System.out.println("\n프로그램 종료");
	} // end main()
	
} // end class










