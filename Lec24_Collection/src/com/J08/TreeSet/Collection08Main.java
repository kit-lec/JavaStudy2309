package com.J08.TreeSet;

/* TreeSet

 Collection<E>
  |__ Set<E>
       |__ HashSet<E>, TreeSet<E>

 TreeSet: 데이터가 정렬된 상태로 저장(오름차순, 내림차순)
 
 	(※ TreeXXX ← 주로 '정렬'에 특화된 자료구조 입니다)
*/
public class Collection08Main {

	public static void main(String[] args) {
		System.out.println("TreeSet 클래스");
		
		// Integer 타입을 저장할 수 있는 TreeSet 인스턴스 생성
		// TODO
		
		// 데이터 저장 : add()
		// TODO
		
		// 데이터 검색 - Iterator 사용
		// TreeSet인 경우에 iterator() 메소드 오름차순 정렬
		System.out.println("오름차순:");
		// TODO
		
		
		System.out.println();
		System.out.println("내림차순:");
		// 내림차순 Iterator : descendingIterator() 사용
		// TODO
		
		// enhanced for
		System.out.println();
		System.out.println("enhanced for");
		// TODO
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class












