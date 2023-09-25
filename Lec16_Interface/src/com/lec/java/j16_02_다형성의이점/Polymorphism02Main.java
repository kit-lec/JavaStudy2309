package com.lec.java.j16_02_다형성의이점;

/* 다형성의 유용성
	다형성에 의해서, 자식타입 객체가 부모타입으로 자동 형변환 가능!
	부모(조상)타입 만으로도 상속된 모~든 자손 타입들을 담을수 있다.
*/

import com.lec.java.j16_01_Polymorphism.Car;
import com.lec.java.j16_01_Polymorphism.HybridCar;
import com.lec.java.j16_01_Polymorphism.Vehicle;

/*
 *
 *	어떤 경우에 상속으로 객체를 설계하나?
 *		 HAS-A 관계 ===>  멤버로 설계
 *					Car, Tire
 * 					Car is-a Tire  (X)
 *					Tire is-a Car (X)
 *					Car has-a Tire (OK)
 *
 * 		 IS-A 관계 ===>  상속으로 설계
 *		 			Vehicle is-a Car  (NO)
 *		 			Car is-a Vehicle  (OK)
 *					HybridCar is-a Car (OK)
 */

public class Polymorphism02Main {

	public static void main(String[] args) {
		System.out.println("다형성의 사용 (유용성)");

		Vehicle car1 = new Vehicle();
		Vehicle car2 = new Car();
		Vehicle car3 = new HybridCar();

		// 다형성의 유용함 1
		// 부모타입으로 모든 자손 타입들을 담을수 있다.
		Vehicle[] cars = new Vehicle[3];
		cars[0] = new Vehicle();
		cars[1] = new Car();
		cars[2] = new HybridCar();

		// car 라는 하나의 이름의 변수로 여러가지 타입의
		// 오버라이딩 된 메소드가 각각 동작시킬수 있다!
		for(var car : cars){
			car.displayInfo();
		}

		// 다형성이 없었다면?  각 타입별로 변수들을 만들고 따로따로 사용해야 하는 왕불편.
		//		Vehicle car1 = new Vehicle();
		//		Car car2 = new Car();
		//		HybridCar car3 = new HybridCar();
		//		car1.displayInfo();
		//		car2.displayInfo();
		//		car3.displayInfo();

		// 다형성의 유용함 2
		// 다형성의 유용함은 매개변수, 혹은 리턴 타입에도 적용된다
		// println의 매개변수로 Object의 참조변수가 넘겨지면,
		// 내부적으로 해당 클래스의 toString() 메소드가 불리게 됨
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);

		// instanceof 연산자
		// 용법: 변수/값 instanceof 클래스
		// 결과: true / false

		System.out.println(car1 instanceof Vehicle);
		System.out.println(car1 instanceof Car);
		System.out.println(car2 instanceof Vehicle);




		System.out.println("\n 프로그램 종료");
	} // end main()
	
	// TODO

} // end class












































