package com.lec.java.j12_01_메소드정의;

/* 메소드 (Method):
 		반복되는 코드, 내용, 재사용해야할 코드들을 한 뭉치로 묶어서
 		따로 메소드로 만들은 다음(정의) 이를 필요할때마다 사용(호출)한다. 
 		
 		※ 자바는 '함수(function)' 가 따로 없습니다
 		  그러나 교육하면서 편의상, 혼용하여 말하겠습니다.
 		
	 메소드 정의:
	 	메소드는 main 메소드 바깥에서!!, class 안에서 정의!!

	 메소드 정의구문:
		수식어      리턴타입    메소드이름  (매개변수, ...) { ... 메소드 본체(body) }
	    modifier return_type  method_name(parameter, ...) { ... }
	
		수식어(modifier) : public, static, private, ... (생략 가능)
	   
		매개변수 (parameter) : 메소드 호출시 넘겨주는 값.

		리턴타입 (return type) : 메소드 종료후 호출한 쪽에 돌려주는 값
			void, int, double, String ...
			(리턴타입 void의 의미는 되돌려주는 값(return 값)이 없다는 의미)
	
	메소드 signature 란?:
		메소드 이름 + 매개변수 리스트 (매개변수 타입, 순서, 개수)
			sayAge(int)
			sayHello3(String, int)
			
*/

public class Method01Main {
	
	public static void main(String[] args) {
		System.out.println("메소드(함수) Method(Function)");

		System.out.println("안녕하세요.");
		System.out.println("제 이름은 이문권 입니다.");

		System.out.println("안녕하세요.");
		System.out.println("제 이름은 박주현 입니다.");

		System.out.println("안녕하세요.");
		System.out.println("제 이름은 이지훈 입니다.");

		System.out.println();

		// 메소드 호출
		sayAnthem();

		sayHello("장윤근");
		sayHello("이정식");

		// TODO

		System.out.println("\n프로그램 종료");
	} // end main()
	
	// 메소드 정의
	public static void sayAnthem(){
		System.out.println("""
    			동해물과 백두산이
    			마르고 닳도록
    			하느님이 보우하사
    			우리나라 만세""");
	}

	//   메소드이름: sayHello
	//   매개변수: name (매개변수가 필요없는 경우에는 생략 가능)
	public static void sayHello(String name){
		System.out.println("안녕하세요.");
		System.out.println("제 이름은 " + name + " 입니다.");
	}

} // end class

/*
 * IntelliJ 단축키 : 메소드 이름위에서 (호출, 정의)
 *     CTRL + B : Declaration or Usage
 *  ALT + F7 : Find Usage
 *  ALT + ↑, ALT + ↓ : 메소드 단위 커서 이동
 *  CTRL + SHIFT + ↑, CTRL + SHIFT + ↓ : 메소드 이동
 *  CTRL + P : parameter info
 *
 * 디버깅 :
 *   step into : 현재 디버깅 위치의 메소드 호출 내부 코드 진입
 *   step out (step return) : 현재 디버깅 진행중인 메소드 return 까지 진행후 호출한 측으로 돌아감
 *   resume : 다음 breakpoint 까지 쭈욱 진행
 */










