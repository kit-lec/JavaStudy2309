package com.J01.ArrayList;

/* ArrayList<E>
	 ※계층도 숙지 중요
	
	 Collection<E>
	  |__ List<E>
	       |__ ArrayList<E>, LinkedList<E>
	
	 List 특징(ArrayList와 LinkedList의 공통점)
	 1. 중복 저장 허용
	 2. 저장 순서 유지 (인덱스 존재)
	
	 ArrayList:
	 1. 저장 용량을 늘리는 데 많은 시간 소요 - 단점
	 2. 데이터를 삭제하는 데 많은 연산 - 단점
	 3. 데이터 참조 매우 빠름 - 장점
	
	 LinkedList:
	 1. 저장 용량을 늘리는 과정이 매우 간단 - 장점
	 2. 데이터를 삭제하는 과정이 간단 - 장점
	 3. 데이터 참조가 불편 - 단점
	 
	 
	 ※ Vector<E> <-- ArrayList 와 비슷하나... ArrayList 추천.

	 ※ 데이터 자료구조를 다룰시 각 자료구조에서 데이터에 대한 다음 동작들이 어떻게 되는지 주목하자
	 - C (Create) 생성
	 - R (Read) 조회
	 - U (Update) 수정
	 - D (Delete) 삭제 

*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collection01Main {

	public static void main(String[] args) {
		System.out.println("ArrayList<E>");
		
		// ArrayList 선언 - ArrayList 인스턴스 생성
		// TODO
		
		// 데이터 추가(저장): add(element) 메소드 사용
		//               add(index, element) -> index 번째 삽입
		// TODO
		
		
		// 데이터 참조(읽기, 검색): get(index) 메소드 사용
		// size(): ArrayList의 크기를 반환(리턴)
		// TODO
		
		// 데이터 삭제: remove(index) 메소드 사용
		// TODO
		
		// 데이터 수정: set(index, element) 메소드 사용
		// TODO

		// 데이터 존재여부: contains() => true/false
		// TODO

		// ArrayList 출력 방법
		// 1) for
		// 2) Enhanced-for 사용
		// 3) Iterator(반복자) 사용
		// 4) forEach() 사용

		System.out.println("Enhanced for를 사용한 출력");
		// Enhanced for 사용 가능
		// TODO
		
		System.out.println("Iterator 를 사용한 출력");
		// Iterator(반복자) 사용법
		// iterator() 메소드를 사용해서 인스턴스 생성
		// TODO
		
		// hasNext(): iterator가 다음 원소를 가지고 있는 지(true/false)
		// next(): 현재 iterator 위치의 원소를 값을 리턴하고,
		//   iterator의 위치를 다음 원소의 위치로 변경
		// TODO
		
		
		System.out.println("forEach() 를 사용한 출력");
		// forEach() + functional interface
		// Java8 부터 등장
		// TODO
		
		System.out.println("toString() 사용");
		// Collection<> 대부분은 toString() 오버라이딩 되어 있다.
		// TODO

		System.out.println("\n다양한 List<> initializer");
		// 참고: https://www.baeldung.com/java-init-list-one-line
		{
			List<String> list;

			// List <- 배열
//			list = TODO;
//			System.out.println(list);

			// List <- var args
//			list = TODO;
//			System.out.println(list);

			// Stream 사용 (Java8 이상)
//			list = TODO
//			System.out.println(list);

			// Factory method (Java9 이상)
			// ★ immutable list(unmodifiable list) 가 생성된다.
//			list = TODO;
//			System.out.println(list);

			// Double-brace initialization
			// 비추
//			list = TODO
//			System.out.println(list);
		}


		System.out.println("\n프로그램 종료");
	} // end main

} // end class










