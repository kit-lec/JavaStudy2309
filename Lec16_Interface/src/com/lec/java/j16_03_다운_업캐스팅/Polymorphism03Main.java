package com.lec.java.j16_03_다운_업캐스팅;

import com.lec.java.j16_01_Polymorphism.Car;
import com.lec.java.j16_01_Polymorphism.HybridCar;
import com.lec.java.j16_01_Polymorphism.Vehicle;

/**
 *   업캐스팅 (Upcasting)
 *        자식 클래스의 객체가 부모 클래스 타입으로 형변환 되는 것
 *
 *   다운캐스팅 (Downcasting)
 *         업캐스팅의 반대
 *         하위 클래스로의 다운캐스팅을 할때는 명시적으로 변환할 타입을 지정해주어야 한다.
 *         이때 , 캐스팅에 실패하면 ClassCastException 발생
 */
public class Polymorphism03Main {

	public static void main(String[] args) {
		System.out.println("다형성의 어려움");

		Vehicle car1 = new Vehicle();
		Vehicle car2 = new Car();     // 다형성, 업캐스팅
		Vehicle car3 = new HybridCar();  // 다형성, 업캐스팅

		car2.setSpeed(10);
		// car2는 Vehicle 타입으로 선언되어 있으므로,
		// Vehicle 클래스에 정의된 메소드를 사용할 수 있다.

		//car2.setOil(100);  // 에러!
		// car2는 Vehicle 타입으로 선언되어 있으므로,
		// Vehicle이 아니 다른 클래스(심지어 자식 클래스이더라도)에 정의된
		// 메소드는 사용할 수 없다.
		// 따라서, 실제로는 Car 타입 인스턴스로 생성되긴 했지만,
		// Vehicle 타입 참조변수로는 Car 클래스에 있는 메소드를 사용할 수 없다.

		((Car)car2).setOil(100);  // 다운 캐스팅
		// 실제로 Car 클래스의 인스턴스로 생성된 car2 변수는
		// 형변환(casting)을 통해서 Car 타입으로 변환할 수 있고,
		// Car 클래스에 정의된 메소드를 사용할 수 있다.


		//((Car)car1).setOil(10);
		// ClassCastException 발생:
		// 실제로 Vehicle 클래스의 인스턴스로 생성된 car1을
		// 자식 클래스인 Car로 강제 형변환을 하게 되면 문제가 발생할 수 있다.
		// 예외는 setOil() 을 호출하는 과정이 아니라, 다운캐스팅 형변환 하는 과정에서 발생된다

		((Car)car3).setOil(100);

		System.out.println("\n 프로그램 종료");
	} // end main()

} // end class













































