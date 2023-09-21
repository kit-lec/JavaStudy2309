package com.lec.java.j13_07_Lombok;

/**
 * Lombok 라이브러리
 *  '개발과정'에서 발생하는  잦은 클래스 설계 변경등에 대해 자동적으로
 *  생성자, getter, setter, toString(), builder 제공해줌
 *
 *    https://projectlombok.org/
 *
 * 	Java 개발자의 필수 사용 라이브러리!
 *
 * 	Lombok 라이브러리는 'runtime' 에 동작하는 라이브러리가 아니라
 * 	'compile time' 에 동작하는 라이브러리다.
 */

/**
 * IntelliJ 에서 Lombok 사용시.
 *  - Settings 에서 Enable annotation processing 활성화  체크
 *  - Plugin 에 IntelliJ Lombok plugin 설치 여부 체크
 *
 * IntelliJ 에서 외부 라이브러리 (*.jar) 추가
 *   1. 라이브러리 다운로드 : https://projectlombok.org/
 *   2. 프로젝트/모듈에 폴더 만들기 (ex: /lib)
 *   3. Project Structure 에서 해당 프로젝트/모듈 의 dependencies 에 Add
 *
 * Lombok 이 잘 동작하는지 여부
 *   class 내용을 작성할때
 *   Structure 창(ALT+7)을 열고 적용되는 내용을 확인해볼수 있다.
 **/

public class Class10Main {

	public static void main(String[] args) {
		System.out.println("\nLombok 라이브러리 사용");

		Model m1 = new Model();
		System.out.println(m1);  // toString() 값

		// TODO

		System.out.println("\n프로그램 종료");
	} // end main

} // end class




















