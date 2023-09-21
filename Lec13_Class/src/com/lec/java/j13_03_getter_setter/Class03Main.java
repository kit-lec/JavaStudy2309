package com.lec.java.j13_03_getter_setter;

/**
 *  캡슐화, 은닉, 추상화
 *
 *  클래스 안에 필요한 '속성' 과 '행동' 을 멤버로 묶고
 *  외부에서의 '직접적인 접근을 제한'하여
 *  객체의 데이터 와 메소드를 은닉(hiding)하고,
 *  사용자에게는 필요한 기능만 제공하여 추상화(abstraction) 하는
 *  객체지향 기술을 '캡슐화(encapsulation)' 라고 한다
 *
 *  접근을 제어하기 위해 Access modifier 를 사용 (다음 단원에 자세히..)
 *
 *  클래스의 멤버변수를 접근하기 위한 기능을 제공하는 메소드를
 *  getter , setter 라 한다
 */

/**
 *  ● Java Bean (자바빈) 이란
 *  	Java Beans (자바 빈즈) 규약에 따라 작성된 자바 클래스
 *		자바빈 클래스 외부에서 필드에 접근할 경우 받드시 규약대로 정의된 getter, setter 메소드를 통해 접근해야 한다.
 *	    바로 이렇게 제공되는 getter, setter 를 프로퍼티 (property) 라 한다. ★★
 *
 *	● 프로퍼티 (Property, 속성)
 *     getter, setter 네이밍 규약
 *		- 프로퍼티 값을 '읽는' 메소드는 get으로 시작한다.  (읽기 속성)
 * 		- 프로퍼티 값을 '변경'하는 메소드는 set으로 시작한다.  (쓰기 속성)
 * 		- get과 set 뒤에는 프로퍼티의 이름 첫 글자를 대문자로 바꾼다.
 * 		- set 메소드는 1개의 파라미터를 갖는다.
 *
 *    ★ property 는 필드 가 아니다!   property 는 getter, setter 를 말한다.
 *    ★ property 는 반드시 '필드'값에 대해 읽고 쓰는 것만이 아니라, 객체의 속성을 표현하는 값을 다루는 것이면 무엇이든 가능
 */
public class Class03Main {

	public static void main(String[] args) {
		System.out.println("Getter & Setter");
		
		Number n = new Number();
		Number n1 = new Number(100);

		//n1.num = 300;

		System.out.println(n1.getNum());
		n1.setNum(200);
		System.out.println(n1.getNum());

		n1.setNum(-200);
		System.out.println(n1.getNum());

		System.out.println("프로그램 종료");
	} // end main()
} // end class Class03Main














