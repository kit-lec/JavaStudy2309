package com.lec.java.j24_01_Lambda;

/* 람다 표현식: lambda-expression
 * 	Java8 부터 도입:
 * 		(매개변수 리스트) -> 리턴값
 * 		(매개변수 리스트) -> {...}  수행코드
 *
 * 	람다 표현식은 추상메소드가 '하나뿐'인 인터페이스 구현. (이를 함수형 인터페이스 functional interface) 라 한다
 *  @FunctionalInterface 를 사용하여 명시적으로 함수형 인터페이스임을 지정할수 있다
 *
 * 	- 익명클래스의 더 간략화한 표현식
 * 	- 함수 한개(메소드 한개)를 표현하기 위한 식
 */

public class Lambda01Main {

	public static void main(String[] args) {
		System.out.println("인터페이스, 익명 클래스, 람다 표현식");
		
		System.out.println();
		System.out.println("[1] 인터페이스를 구현하는 클래스");
		Addable myAdder = new AdderImple();
		System.out.println(myAdder.add(1.11, 2.22));
				
		System.out.println();
		System.out.println("[2] 익명 클래스 사용");
		Addable myAdder2 = new Addable() {
			@Override
			public double add(double x, double y) {
				return x + y;
			}
		};
		System.out.println(myAdder2.add(1.11, 2.22));
		
		System.out.println();
		System.out.println("[3] 람다 표현식(lambda expression) 사용");
		// 람다 표현식:
		// (매개변수 리스트) -> 리턴값
		// (매개변수 리스트) -> {...}  수행코드

		Addable myAdder3 = (a, b) -> a + b;
		System.out.println(myAdder3.add(1.11, 2.22));
		
		System.out.println("\n프로그램 종료");
	} // end main()
	
} // end class

//함수형 인터페이스 정의
@FunctionalInterface
interface Addable {
	double add(double x, double y);
	//double sub(double x, double y);
}

//인터페이스를 구현하는 클래스를 정의
class AdderImple implements Addable {
	@Override
	public double add(double x, double y) {
		return x + y;
	}
}











