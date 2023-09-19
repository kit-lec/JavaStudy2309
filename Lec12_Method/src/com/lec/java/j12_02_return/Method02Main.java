package com.lec.java.j12_02_return;

/* return 의 의미
 * 
 *   1. 메소드를 호출한 곳으로 값을 리턴한다.
 *   2. 메소드 종료
 *   3. 메소드 정의시 명시한 리턴타입의 값이 '반드시' 리턴되어야 한다
 *          (혹은 리턴타입으로 형변환 가능한 값이)
 */

public class Method02Main {

	public static void main(String[] args) {
		System.out.println("메소드의 리턴 타입");
		
		int sum = add(110, 220);
		System.out.println("sum = " + sum);

		System.out.println(add(40, 20));

		int result = sub(100, 200);
		System.out.println(result);

		result = sub(add(10, add(100, 300)), 100)
		;
		System.out.println(result);
		/*
		①	sub(         , 100	)
			       ↑
		②	  add(10,         )
			           ↑
		③	     add(100, 300)

		    호출순서 : ① ② ③
		    리턴순서 : ③ ② ①
		 */
		
		System.out.println("\n프로그램 종료");
	} // end main()

	// 메소드 이름: add
	// 매개변수:
	//   1) int x
	//   2) int y
	// 리턴타입: int
	public static int add(int x, int y){
		int result = x + y;
		return result;
	}

	
	// 메소드 이름: sub
	// 매개변수:
	//   1) int x
	//   2) int y
	// 리턴타입: int
	public static int sub(int x, int y){
		return x - y;
	}
	
	// 메소드 이름: multiply
	// 매개변수:
	//   1) int x
	//   2) int y
	// 리턴타입: int
	// TODO
	
	// 메소드 이름: divide
	// 매개변수: 
	//   1) int x
	//   2) int y
	// 기능: x를 y로 나눈 몫을 리턴하는 메소드
	// 리턴타입: int
	// TODO
	
	
	// 메소드 이름: divide2
	// 매개변수:
	//   1) int x
	//   2) int y
	// 만약에 y 가 0 이면 -->  "0으로 나눌수 없습니다" 
	// y 가 0 이 아니면 -->  "몫은 ~~이고 , 나머지는 ~~ 입니다"
	// 리턴타입: String ★
	// TODO

	
} // end class

/*
   Refactor - Introduce Variable  CTRL + ALT + V
   Refactor - Inline Variable  CTRL + ALT + N
 */











