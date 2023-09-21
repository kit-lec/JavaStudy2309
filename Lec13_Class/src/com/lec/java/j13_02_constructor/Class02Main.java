package com.lec.java.j13_02_constructor;


public class Class02Main {

	public static void main(String[] args) {
		System.out.println("클래스 연습");		
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(3);

		c1.radius = 10;
		System.out.println(c1.calcPerimeter());
		System.out.println(c1.calcArea());

		System.out.println(c2.calcPerimeter());
		System.out.println(c2.calcArea());



		System.out.println("프로그램 종료");
	} // end main()

} // end class Class02Main










