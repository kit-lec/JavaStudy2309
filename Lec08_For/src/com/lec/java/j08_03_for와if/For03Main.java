package com.lec.java.j08_03_for와if;

public class For03Main {

	public static void main(String[] args) {
		System.out.println("for 연습");

		// 1 ~ 10 수 중에서 짝수(2의 배수)만 출력
		for(int i = 1; i <= 10; i++){
			if(i % 2 == 0)
				System.out.println(i);
		}

		System.out.println();

		for(int i = 2; i <= 10; i += 2){
			System.out.println(i);
		}
		

	} // end main()

} // end class For03Main




