package com.lec.java.j15_01_상속이없다면;

public class Inherit01Main {

	public static void main(String[] args) {
		System.out.println("상속(Inheritance) 을 사용하지 않는 경우");

		// BasicTV 클래스의 인스턴스를 생성한다
		BasicTV tv1 = new BasicTV();
		tv1.isPowerOn = true;
		tv1.volume = 10;
		tv1.channel = 5;
		tv1.displayInfo();

		// SmartTV 클래스의 인스턴스를 생성한다
		SmartTV tv2 = new SmartTV();
		tv2.isPowerOn = true;
		tv2.channel = 123;
		tv2.volume = 12;
		tv2.ip = "192.168.0.111";
		tv2.displayInfo();



		System.out.println("\n프로그램 종료");
	} // end main()
} // end class










