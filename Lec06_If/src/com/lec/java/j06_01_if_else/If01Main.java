package com.lec.java.j06_01_if_else;

/* if, if ~ else 조건문
 * 
 * 구문1:
 * 	if (조건식) {
 *  	조건식이 true 일때 실행되는 문장(들) 
 *  	...
 * 	}
 * 
 * 구문2:
 *  if (조건식) {
 *		조건식이 true 일때 실행되는 문장(들)
 *		...
 *  } else {
 *		조건식이 false 일때 실행되는 문장(들)
 *		...
 *  }
 */
public class If01Main {

	public static void main(String[] args) {
		System.out.println("if 조건문");

		int num = 33;

		if(num > 0){
			// if () 조건식이 true일 때 실행하는 코드
			System.out.println("양수입니다");
		} else {
			// if () 조건문이 false일 때 실행되는 부분
			System.out.println("음수입니다");
		}

		if(num % 2 == 0){
			System.out.println(num + "은 짝수입니다");
		} else {
			System.out.println(num + "은 홀수입니다");
		}

		// 0 이상, 100 이하
		// 0 <= num <= 100
		if(0 <= num && num <= 100){
			System.out.println(num + " 값은 0 이상 100 이하입니다");
		}
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class



/**
 * Debug (디버깅)
 * 		: 프로그램의 '논리적 오류' 를 찾아내기 위한 작업
 * 		: "프로그램의 실력은 곧 디버깅 실력이다!"
 *
 * 	step1 : breakpoint 설정  (CTRL + F8)  (목록: CTRL+SHIFT+F8)
 * 	step2 : debug 시작       (SHIFT + F9)
 * 	        breakpoint 를 만나면 프로그램 실행이 일시 중단된다 -> step3 로
 * 	step3 :
 * 		 step over : 한 단계씩 명령 실행 (F8)
 * 		 resume : 다음 breakpoint 까지 진행 (F9)
 *
 *      확인해야 하는 것들
 * 		1) 프로그램의 흐름
 * 		2) 변수값의 변화
 * 		3) 호출관계 흐름
 *
 * 	step4 : debug 종료 (terminate)  (CTRL+F2)
 *
 */










