package com.J03.Optional메소드;

/* Optional 의 주요 메소드
 * 
 * -boolean isPresent()
 * 		내부객체가 null이 아닌지 확인한다. null이면 false를 반환한다.
 *
 * -void ifPresent(Consumer<T>)
 * 		Consumer<T>는 함수형 인터페이스 포스팅에서 봤듯 void 추상메서드를 갖고있다. null이 아닐때만 실행된다.
 * 
 * -Optional<T> filter(Predicate<T>)
 * 	  내부객체가 해당 조건을 만족하는지 확인.  (Predicate 메소드는 boolean 을 리턴)
 *    Optional<U> 리턴
 * 
 * -Optional<U> map(Function<T, U>)
 * 	  스트림과 같다. 내부 객체를 변환하는 용도로 사용한다.
 *    Optional<U> 리턴
 * 
 * -T get()
 * 	  내부 객체를 반환한다. 다만 내부 객체가 null이면 NPE가 발생한다.
 * 	  null이 아니라는 확실한 경우에만 사용한다.
 * 
 * -T orElse(T)
 * 	 내부 객체를 반환한다. 내부 객체가 null이면 인자로 들어간 기본값을 반환한다.
 * 
 * -T orElseGet(Supplier<T>)
 * 	  orElse()와 동일한데 orElse()가 기본값 레퍼런스를 인자로 받는다면 orElseGet()은 내부 객체가 null일때 기본값을 반환할 객체를 인자로 받는다.
 * 
 * -T orElseThrow(Supplier<U>)
 * 	 내부 객체가 null이면 인자로 전달받은 예외를 발생시킨다.
 * 
 */

import common.Address;

import java.util.Optional;

public class Optional03Main {

	public static void main(String[] args) {

		System.out.println("Optional 의 주요 메소드");

		Address addr1 = new Address("역삼로");
		Address addr2 = null;
		Optional<Address> optAddr1, optAddr2;
		
		// TODO

		System.out.println("\n프로그램 종료");
	} // end main

} // end class
