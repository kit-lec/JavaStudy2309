package com.J02.Optional생성;

import java.util.Optional;

/* Optional<T>
 * 	자바의 고질적인 null 체크 피하기 위한 객체
 * 	Java8 에서 등장
 * 	null 값을 담을수 있는 값을 감싸는 래퍼객체
 * 	
 * class Optional<T> {
 * 		T value;
 * 		 ...
 * }
 * 
 * Optional 생성 메소드들
 * 		Optional.of(value) : value 가 null이면 NPE 발생 * 					
 * 		Optional.ofNullable(value) : value 가 null이면 empty Optional 생성
 * 		Optional.empty() : empty Optional 생성
 *
 *  Optional에 담길 값이 int, long, double 이라면 Boxing/Unboxing이 발생하는
 *  Optional<Integer>, Optional<Long>, Optional<Double>을 사용하지 말고,
 *  OptionalInt, OptionalLong, OptionalDouble을 사용하자.
 */

public class Optional02Main {
	public static void main(String[] args) {
		System.out.println("Optional<T> 생성");
		String str = "hello";
		
		// TODO
		
		// 1. Optional.of(value) 를 사용하여 생성
		// TODO

		// 2. Optional.ofNullable(value)
		// value 가 null이면 empty Optional 객체 반환
		// TODO
		
		// 3.Optional.empty()  empty Optional 객체 반환
		// TODO

		// OptionalInt, OptionalDouble, OptionalLong
		// TODO

		System.out.println("\n프로그램 종료");
	} // end main()
} // end class


















