package com.J10.HashMap;

/* Map<K, V>, HashMap<K, V>
	 Collection<E>
	  |__ List<E>, Set<E>
	
	 List<E>
	  |__ ArrayList<E>, LinkedList<E>
	
	 Set<E>
	  |__ HashSet<E>, TreeSet<E>
	
	 Map<K, V>
	  |__ HashMap<K, V>, TreeMap<K, V>
	
	 Map: key-value 저장 방식의 자료 구조
	  1. key는 중복되지 않는 값만 허용
	  2. value는 같더라도 key 값이 다르면 저장 가능
	  3. 검색, 수정, 삭제를 할 때 key를 사용

	Map 의 데이터 원소는 key-value 쌍 => Map.Entry<K,V>
*/


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collection10Main {

	public static void main(String[] args) {
		System.out.println("HashMap 클래스");
		
		// HashMap 인스턴스 생성
		// Key - Integer 타입
		// Value - String 타입
		Map<Integer, String> hmap = new HashMap<>();
		
		// 데이터 저장: put(key, value) 메소드 사용
		System.out.println("put 결과: " + hmap.put(1, "이지훈"));
		System.out.println("put 결과: " + hmap.put(2, "장윤근"));
		System.out.println("put 결과: " + hmap.put(3, "이재환"));
		System.out.println("put 결과: " + hmap.put(1, "이정식"));

		// 기존에 없던 key 값으로 put 하면 null 리턴하고
		// 같은 키 값으로 데이터를 put하게 되면, 기존 값이 수정(replace)되고 기존 값을 리턴함

		
		// 저장된 데이터 개수 확인 : size()
		System.out.println("Map 의 size(): " + hmap.size());
		System.out.println(hmap);
		
		
		// 데이터 읽기
		// get(key) 사용해서 value 읽기
		System.out.println();
		System.out.println(hmap.get(1));
		System.out.println(hmap.get(5));  // 없는 key 값에 대해선 null 리턴

		// getOrDefault(key, default)
		// 없는 key 값에 대해 default 값 리턴
		System.out.println();
		System.out.println(hmap.getOrDefault(1, "김철수"));
		System.out.println(hmap.getOrDefault(5, "김철수"));

		
		// 데이터 삭제 
		// remove(key) : 삭제된 value 리턴
		// 없는 key 삭제하면 null 리턴
		System.out.println("삭제: " + hmap.remove(2));
		System.out.println("삭제: " + hmap.remove(2));   // null
		System.out.println(hmap);
		
		// 방법1 HashMap에서 Iterator 사용
		// 1. HashMap의 keySet() 메소드를 사용해서
		// 저장된 키(key)값들만 이루어진 Set을 만듬.
		// 2. 1에서 만들어진 Set에 있는 iterator() 메소드를 사용해서
		// Iterator를 생성
		System.out.println();
		Set<Integer> keySet = hmap.keySet();
		System.out.println("keySet : " + keySet);

		Collection<String> values =  hmap.values();
		System.out.println("values : " + values);

		//Set<Map.Entry<Integer, String>> entrySet = hmap.entrySet();
		var entrySet = hmap.entrySet();
		System.out.println("entrySet : " + entrySet);


		Iterator<Integer> itr = keySet.iterator();
		while(itr.hasNext()){
			int key = itr.next();  // key 값
			System.out.println(key + " : " + hmap.get(key));  // key - value

		}

		System.out.println();
		
		// 방법2 : Map.Entry 사용
		// entrySet() 은 Set<Entry<Integer, String>> 리턴함

		for(Map.Entry<Integer, String> entry : hmap.entrySet()){
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		// 방법3 : toString()
		// TODO
		
		System.out.println();

		//-----------------------------------------------------------
		// HashMap 을 초기화 하는 다양한 방법들
		System.out.println("\n다양한 Map initializer");
		// 참고:  https://www.baeldung.com/java-initialize-hashmap
		{
			Map<String, String> map1;
			Map<String, Integer> map2;

			// Stream 사용 (Java8 이상)
			// key, value 가 같은 타입이면
//			map1 = TODO
//			System.out.println(map1);

			// key, value 가 서로 다른 타입이라면 Object[][] 로 초기화 가능
			// object 인 경우 형변환
//			map2 = TODO
//			System.out.println(map2);

			// Java9 방식
			// Map.of( .. ) <= 최대 10개까지의 key, value 쌍 지정 가능
//			map1 = TODO
//			System.out.println(map1);

//			map1 = TODO
//			System.out.println(map1);

//			map1 = TODO
//			System.out.println(map1);

			// double-brace syntax 사용.
//			map1  = TODO
//			System.out.println(map1); // {key1=value1, key2=value2}
		}

		//-----------------------------------------------------------
		// 도전과제
		// arr[] = {2, 4, 5, 4, 3, 3, 4}
		// 주어진 배열이 위와 같을때 다음과 같이 발생회수 나타내기 
		// 2 : 1개 
		// 3 : 2개 
		// 4 : 3개 
		// 5 : 1개
		
		System.out.println("HashMap 응용: 배열에서 발생빈도 구하기");
		int arr[] = {2, 4, 5, 4, 3, 3, 4, 1, 1, 1, 1, 1, 5, 5, 5, 5};
		printFreq(arr);
		
		System.out.println("\n프로그램 종료");
	} // end main()

	private static void printFreq(int[] arr) {
		// 발생빈도를 담을 Map<> 준비
		// key : 등장 데이터
		// value : 등장 횟수
		HashMap<Integer, Integer> hmap = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			// 방법1 : get() 사용
//			{
//				Integer count = hmap.get(arr[i]);
//				if(count == null)   // 기존에 해당 key값이 없었다면 (즉, 첫 등장이면)
//					hmap.put(arr[i], 1);  // 등장 횟수 1
//				else               // 기존에 key 값이 존재했던 (즉, 이전에 1번이상 등장했었다)
//					hmap.put(arr[i], count + 1);  // 기존 등장 횟수에 +1
//			}

			// 방법2 : getOrDefault()
			{
				Integer count = hmap.getOrDefault(arr[i], 0);
				hmap.put(arr[i], count + 1);
			}

		} //  end for

		// 결과 출력
		for(var e : hmap.entrySet()){
			System.out.println(e.getKey() + " : " + e.getValue() + "개");
		}
	}

	// TODO
	
} // end class















