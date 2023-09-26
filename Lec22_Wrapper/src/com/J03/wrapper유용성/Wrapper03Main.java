package com.J03.wrapper유용성;

/* Wrapper 클래스의 유용성
 * 1. Object 타입이 모~든 (심지어 primitive) 타입도 받을수 있다.
 * 2. Collection 과 같은 Generic 클래스에선
 *     primitive 타입을 담을수 없다. 그러나 ,Wrapper 를 통해 가능하다.
 *     
 * 3. Wrapper 는 null 값 표현 가능
 */
public class Wrapper03Main {

	public static void main(String[] args) {
		System.out.println("Wrapper 클래스의 유용성");
		
		Object[] obj = new Object[5];
		obj[0] = new A();
		obj[1] = new A2();
		obj[2] = new B();
		obj[3] = "Hello";
		obj[4] = 123;
				// auto-box + 다형성
				//  Integer <- Integer.valueOf() <- 123

		for(var e : obj) System.out.println(e);

		// 주의
		//int num = obj[4];
		int num = (Integer)obj[4];
		// ↑ 실제 담고 있는게 Integer 다 하더라도,
		//  원소타입이 Object 이기 때문에  일단 Wrapper 로 형변환 하여 auto-unboxing 이 발생하게 해야 한다



		System.out.println("\n프로그램 종료");
	} // end main()

	// TODO
	
} // end class

class A{}
class A2 extends A{}
class B{}