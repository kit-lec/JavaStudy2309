package com.lec.java.j14_08_singleton;

/*
 * Singleton 디자인
 * 	인스턴스가 최대 1개까지만 생성되어야 하는 디자인 패턴
 */

public class Static03Main {

	public static void main(String[] args) {
		System.out.println("Singleton 디자인 패턴");

//		Test t1 = new Test();
//		Test t2 = new Test();

		Test t1 = Test.getInstance();
		System.out.println(t1.getNum());
		t1.setNum(123);
		System.out.println(t1.getNum());
		System.out.println(t1);

		System.out.println();

		Test t2 = Test.getInstance();
		System.out.println(t2);
		System.out.println(t2.getNum());

		t2.setNum(12345);
		System.out.println(t1.getNum());
		System.out.println(t2.getNum());


	} // end main()

} // end class Static03Main











