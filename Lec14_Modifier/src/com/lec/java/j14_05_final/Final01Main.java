package com.lec.java.j14_05_final;

public class Final01Main {

	// final 멤버 변수
	// (주의) final 멤버 변수는 반드시 선언과 동시에 초기화 (혹은 생성자에서 초기화) 해야 한다
	final int NUM1 = 1;
//	final int NUM2;   // 에러

	final int NUM3;

	public Final01Main(){
		NUM3 = 10;
		//NUM1 = 10;
	}


	public static void main(String[] args) {
		System.out.println("final: 변경할 수 없는 상수");

		final int num2 = 1;
//		num2 = 10;

		final int num3;
		num3 = 10;

	} // end main()

} // end class Final01Main










