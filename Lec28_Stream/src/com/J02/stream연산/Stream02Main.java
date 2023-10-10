package com.J02.stream연산;

import common.Customer;

import java.util.*;
import java.util.stream.*;

/**
 *   스트림 연산
 *  스트림 연산은 기존자료를 변경하지 않음 (즉 배열에서 생성한 스트림이 원본 배열을 직접 건드리진 않음)
 *  스트림 연산은 '중간연산'과 '최종연산'으로 구분됨
 *
 *  	'중간연산'
 *  		어떤 조건으로 자료를 filtering 한다든가, 어떤 조건에 맞는 자료를 꺼내온다든다
 *  		중간연산은 체이닝 된다.
 *
 *  		map(), filter(), sorted(), distinct()
 *  		limit(), skip(), peek(), boxed()
 *  		mapToInt(), mapToDouble(), mapToLong()
 *  		...
 *
 *          중간연산은 데이터를 다시 Stream 타입으로 리턴하기 때문에 이후 체이닝 가능.
 *
 *
 *  	'최종연산 (터미널 연산)'
 *  		그 결과를 출력한다든가, 합 혹은 평균을 구하는 등의 연산 -> '결과'가 나온다
 *  		최종연산은 자료를 '소모' 하면서 연산을 수행
 *  		그래서, 맨 마지막에 등장. 최종연산후에 스트림은 더이상 다른연산 적용 불가.
 *  		최종연산이 적용(수행)되어야 모든 그 앞의 중간연산이 적용되는 '지연연산'이 발생
 *
 *          forEach()
 *  		min(), max(), count(), sum(), average()
 *  		reduce(a, b)
 *  		anyMatch(), allMatch(), noneMatch(),
 *  		findFirst(), findAny(),
 *  	    collecting()
 */

public class Stream02Main {
	public static void main(String[] args) {
		System.out.println("Stream 연산");

		List<String> stringList = Arrays.asList("John", "Susan", "Tom", "Michael");
		int[] intArr = {10, 20, 30, 40, 50};
		Customer[] arrCustomer = {
				new Customer("John", 32),
				new Customer("Susan", 22),
				new Customer("Tom", 55),
				new Customer("john", 43),
		};
		List<Customer> customerList = Arrays.asList(arrCustomer);

		//----------------------------------------------------------------------
		// forEach(Consumer<T>)    [최종연산]
		// 리턴값: void
		// 주어진 Stream 을 순환하며 연산 수행
		System.out.println("-".repeat(30) +"\n▶ forEach(Consumer<T>)");
		{
			Stream<Customer> stream1 = customerList.stream();
			stream1.forEach(s -> System.out.println(s));
			// ★한번 최종연산한 스트림은 다시 사용 불가 --> IllegalStateException
			// stream1.forEach(s -> System.out.println(s));

			stream1 = customerList.stream();
			stream1.forEach(s -> System.out.println(s.getAge()));
		}


		//----------------------------------------------------------------------
		// filter(Predicate<T>)   [중간연산]
		//   주어진 Stream 에서 Predicate 이 true 로 판정(리턴)하는 것들의 Stream을 생성하여 리턴
		//   입력 ->  출력
		//    n개 ->  <=n개

		 System.out.println("-".repeat(30) +"\n▶ filter(Predicate<T>)");
		{
			System.out.println(stringList);
			// 문자열의 길이 5개 이상인 요소만 출력하기

			stringList.stream()     // Stream<String>
					.filter(s -> s.length() >= 5)  // Stream<String>  중간연산
					.forEach(System.out::println);  // 최종연산

			System.out.println(customerList);
			// 나이가 40살 이하인 사람만 출력
			customerList.stream()
					.filter(c -> c.getAge() <= 40)
					.forEach(System.out::println);
			System.out.println();


		}


		//---------------------------------------------------------------------
		// Map(Function<T, U>)  [중간연산]
		// Stream 의 요소 '각각'에 '연산을 적용하여 변환'한 Stream 리턴
		// 입력  =>  출력
		//  n개  =>  n개

		 System.out.println("-".repeat(30) +"\n▶ map(Function<T, U>)");
		{
			// 고객 이름만 출력하기
			Arrays.stream(arrCustomer)   // Stream<Customer>  4개
					.map(Customer::getName)  // 중간연산 -> Stream<String> 4개
					.forEach(System.out::println);
					;

			Arrays.stream(intArr)
					.map(n -> n - 4)
					.map(n -> n * 2)
					.forEach(System.out::println);
		}


		//-------------------------------------------------------
		// sorted(), sorted(Comparator<T>)   [중간연산]
		//    Stream 을 정렬한 Stream<T> 리턴
		//
		// sorted() : Comparable 을 구현한 객체들의 대소비교
		// sorted(Comparator<T>):   매개변수 Comparator<>  <- 대소 비교

		// System.out.println("-".repeat(30) +"\n▶ sorted(), sorted(Comparator<T>)");
		{
			System.out.println(stringList);

			stringList.stream()
					.sorted()
					.forEach(System.out::println);

			// Comparable<> 이 구현되지 않은 객체로 sorted() 하면
			// ClassCastException 발생!
//			customerList.stream()
//					.sorted()
//					.forEach(System.out::println);

			System.out.println();
			stringList.stream()
					.sorted((o1, o2) -> o1.length() - o2.length())
					.forEach(System.out::println);

			System.out.println();
			stringList.stream()
					.sorted((o1, o2) -> o2.length() - o1.length())
					.forEach(System.out::println);

			System.out.println();
			customerList.stream()
					.sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
					.forEach(System.out::println);
		}

		//-------------------------------------------------------------
		// distinct()    [중간연산]
		//  Stream 에서 중복된 요소 제거한 Stream 리턴
		// primitive type 의 경우  == 으로 '같은지 여부' 판단
		// object type 의 경우 .equals() 로 '같은지 여부' 판단

		 System.out.println("-".repeat(30) +"\n▶ distinct()");
		intArr = new int[]{9, 1, 1, 0, 2, 2, 2, 5, 9, 2, 0};
		{
            System.out.println(Arrays.toString(intArr));

            Arrays.stream(intArr)  // IntStream
                    .distinct()   // 중복된게 제거된 IntStream
                    .forEach(n -> System.out.print(n + ", "));
            System.out.println();

		}


		//-------------------------------------------------------------
		// limit(maxSize)    [중간연산]
		//   Stream 의 가장 앞 요소부터 지정한 maxSize만큼을 Stream 으로 리턴

		 System.out.println("-".repeat(30) +"\n▶ limit(maxSize)");
		{
			Arrays.stream(intArr).limit(5).forEach(s -> System.out.print(s + ", "));
            System.out.println();
			Arrays.stream(intArr).limit(4).forEach(s -> System.out.print(s + ", "));
            System.out.println();
			Arrays.stream(intArr).limit(3).forEach(s -> System.out.print(s + ", "));
            System.out.println();
		}

		//-------------------------------------------------------------
		// skip(n)  [중간연산]
		//   Stream 의 앞요소부터 지정한 개수 n만큼을 제외한 Stream 리턴

		 System.out.println("-".repeat(30) +"\n▶ skip(n)");
		{
            System.out.println(Arrays.toString(intArr));

            Arrays.stream(intArr).skip(3).forEach(s -> System.out.print(s + ", "));
            System.out.println();
            Arrays.stream(intArr).skip(4).forEach(s -> System.out.print(s + ", "));
            System.out.println();
            Arrays.stream(intArr).skip(5).forEach(s -> System.out.print(s + ", "));
            System.out.println();

            // 0, 2, 2, 2, 5, 9
            Arrays.stream(intArr)
                    .skip(3)
                    .limit(6)
                    .forEach(s -> System.out.print(s + ", "));
            System.out.println();
		}

		//-------------------------------------------------------------
		// peek(Consumer<T>)   [중간연산]
		//    현재 진행중인 Stream 에 영향을 주지 않으면서 현재까지 연산된 요소들을 출력하는등의 동작 수행

		// System.out.println("-".repeat(30) +"\n▶ Consumer<T>");
		{
			List<String> nameList = new ArrayList<>();

			// TODO

			// System.out.println("nameList : " + nameList);
		}

		//-------------------------------------------------------------
		// boxed()는
		// primitive 타입 스트림을 => 레퍼런스 타입 스트림으로 boxing 해준다. (boxed 스트림)

		 System.out.println("-".repeat(30) +"\n▶ boxed()");
		{
			IntStream intStream = Arrays.stream(intArr);
			Stream<Integer> boxedStream = intStream.boxed();
            // boxedStream = intStream;  XXX
		}

		//-------------------------------------------------------------
		// mapToInt(), mapToDouble(), mapToLong()
		// boxed 타입 스트림 -> primitive 타입 스트림을 변환
		 System.out.println("-".repeat(30) +"\n▶ mapToInt(), mapToDouble(), mapToLong()");
		{
			Stream<Double> boxedStream;

			boxedStream = Stream.of(10., 20., 30.);
			IntStream intStream = boxedStream.mapToInt(x -> x.intValue());

			boxedStream = Stream.of(10., 20., 30.);
			DoubleStream doubleStream = boxedStream.mapToDouble(x -> x.doubleValue());

			boxedStream = Stream.of(10., 20., 30.);
			LongStream longStream = boxedStream.mapToLong(x -> x.longValue());
		}


		//--------------------------------------------
		// Stream 은 내부반복 로직 수행
		// 기존 for, while 루프 대체

		// TODO


		/*************************************************************/
		System.out.println("■".repeat(30));
		System.out.println("[최종연산(터미널 연산)]");

		//---------------------------------------------------------------
		// sum(), count(), average()    [최종연산]
		//
		//  sum()
		//    primitive stream 에서만 사용 가능.
		//    리턴값: 해당 타입
		//  count()
		//    primitive, boxed 스트림 양쪽에서 사용 가능
		//    리턴값: long
		// average()
		//    primitive stream 에서만 사용 가능.
		//    리턴값 Optional:  Optional<T>, OptionalInt, OptionalDouble ..

		System.out.println("-".repeat(30) +"\n▶ sum(), count(), average()");
		{
            customerList.forEach(System.out::println);

            // 나이의 합
            var result1 = customerList.stream()
                    .mapToInt(Customer::getAge)   // IntStream (OK)
//                    .mapToLong(Customer::getAge)  // LongStream (OK)
//                    .mapToDouble(Customer::getAge)  // DoubleStream (OK)
//                    .map(Customer::getAge)  // Stream<Integer> (에러!)
                    .sum();

            System.out.println("sum() = " + result1);

            // 나이 40 이상은 몇명?
            var result2 = customerList.stream()
                    .filter(x -> x.getAge() >= 40)
                    .count();
            System.out.println("count() = " + result2);

            // 평균나이 구하기
            var result3 = customerList.stream()
                    .mapToInt(Customer::getAge)
//                    .average().getAsDouble()
                    .average().orElse(0)
                    ;
            System.out.println("average() = " + result3);


		}

		//---------------------------------------------------------------
		// min(), max()   [최종연산]
		//
		//  min(), max() 는 primitive, boxed 스트림 양쪽에서 사용 가능
		//    primitive 타입의 경우 max()에 파라미터가 없고, getAsInt()를 이용해 반환 받을 수 있다.
		//    reference 타입인 경우 max()에 Comparator가 파라미터로 들어간다.
		// Optional 리턴:  Optional<T>, OptionalInt, OptionalDouble ..

		 System.out.println("-".repeat(30) +"\n▶ min(), max()");
		{
			// 1-1) 최대 나이값  (primitive)
			var maxAge1 = customerList.stream()
                    .mapToInt(Customer::getAge)  // IntStream
                    .max()         // OptionalInt
                    .getAsInt()
                   ;
            System.out.println("max(): " + maxAge1);

			// 1-2) 최대 나이값  (reference)
			var maxAge2 = customerList.stream()
                    .map(Customer::getAge)      // Stream<Integer>
                    .max((o1, o2) -> o1.compareTo(o2))  // Optional <Integer>
                    .get();
            System.out.println("maxAge2 = " + maxAge2);
		}

		//---------------------------------------------------------------
		// Match  [최종연산]
		// 스트림 연산 결과에 대해서 조건을 검사해 true/false로 리턴한다.
		//   매개변수: Predicate<T>
		//   anyMatch() : 조건을 충족하는 요소가 하나라도 있는 경우 true
		//   allMatch() : 모든 요소가 조건을 충족하는 경우 true
		//   noneMatch() : 모든 요소가 조건을 충족하지 않는경우 true

		 System.out.println("-".repeat(30) +"\n▶ **Match(Predicate<T>)");
		{
			customerList.forEach(System.out::println);

			// 1) 이름에 "o"가 들어가는 사람이 한명이라도 있습니까? (anyMatch 사용)
			boolean result1 = customerList.stream()
					.anyMatch(person -> {
						System.out.println(" - " + person);
						return person.getName().contains("o");
					});
			System.out.println("anyMatch: " + result1);

			// 2) 모든 사람의 이름에 "o" 가 있습니까? (allMatch 사용)
			boolean result2 = customerList.stream()
					.allMatch(p -> p.getName().contains("o"));
			System.out.println("allMatch: " + result2);

			// 3)  모든 사람의 나이가 25살 이상입니까?  (allMatch 사용)
			boolean result3 = customerList.stream()
					.allMatch(p -> p.getAge() >= 25);
			System.out.println("allMatch2: " + result3);

			// 4) 어떤 사람의 이름도 10글자이상이 아닙니까?  (noneMatch 사용)
			boolean result4 = customerList.stream()
					.noneMatch(p -> p.getName().length() >= 10)
					;
			System.out.println("noneMatch: " + result4);
		}

		//-------------------------------------------------------
		// find   [최종연산]
		//
		//   findFirst() : 주어진 스트림에서 '순서상 첫번째' 원소를 리턴
		//   findAny() : 주어진 스트림에서 '가장 먼저' 탐색되는 원소 리턴  (병렬처리 환경)
		//
		//   리턴값: Optional
		//        Stream 에 원소가 없으면 empty 리턴
		//
		//   findFirst() 와 findAny() 의 차이점
		//     Stream 이 직렬로 처리될때는 둘다 동일 값 리턴
		//     Stream 을 병렬로 처리할때는 차이가 있을수 있다
		//         병렬로 처리하는 상황에선 findAny 는 '가장 먼저' 탐색되는 요소 리턴

		// System.out.println("-".repeat(30) +"\n▶ findFirst() findAny()");
		{
			// 1) 나이가 40 이상인 고객중 첫번째 고객
			var result1 = customerList.stream()
					.filter(x -> x.getAge() >= 40)
					.findFirst()  // Optional<Customer>
					;
			System.out.println(result1);
		}


		//---------------------------------------------------------------
		// Collecting   [최종연산]
		//
		// collect(Collector<T, A, R>)
		//    스트린 중간 연산을 결과를 Collector 형태의 파라미터를 받아
		//    다양한 형태로 결과를 만들어준다.
		//
		// Collector<T, A, R>
		//     T : 입력 요소 타입
		//     A : reduction 연산의 누적값 타입
		//     R : reduction 최종 결과 타입
		//
		// Collectors.toList(), Collectors.toMap(), Collectors.toSet()
		//     각각 연산의 결과를 List, Map, Set 으로 변환해 결과를 만든다.
		//

		 System.out.println("-".repeat(30) +"\n▶ collect(Collector<T, A, R>)");
		{
			List<Customer> personList = List.of(
					new Customer("zayson", 28),
					new Customer("chaeyoung", 26),
					new Customer("maeng", 30),
					new Customer("joon", 28)
			);

			personList.forEach(System.out::println);

			// 1) 이름만 List 로 뽑기
			List<String> list1 = personList.stream()
					.map(Customer::getName)   // Stream<String>
					.collect(Collectors.toList());   // List로 변환
			System.out.println(list1);

			// 2) 나이대를 Set으로 뽑기
			Set<Integer> ageSet = personList.stream()
					.map(x -> x.getAge() / 10 * 10)   // Stream<Integer>
					.collect(Collectors.toSet())   // Set 으로 변환
					;
			System.out.println(ageSet);


			// 3) 이름-나이 로 Map 뽑기
			Map<String, Integer> map1 = personList.stream()   // Stream<Customer>
					.collect(Collectors.toMap(Customer::getName, Customer::getAge));  // Map<String, Integer> 로 변환
			System.out.println(map1);

			// 나이-이름 으로 Map 추출
			// key 가 중복되면 예외 발생 IllegalStateException: Duplicate key 28 (attempted merging values zayson and joon)
//			personList.stream()
//					.collect(Collectors.toMap(Customer::getAge, Customer::getName));

			// 위 경우 BinaryOperator 를 이용해 덮어쓰기
			var map2 = personList.stream()
					.collect(Collectors.toMap(Customer::getAge, Customer::getName, (oldValue, newValue) -> newValue));
			System.out.println(map2);

			// Collectors.joining()은 연산한 결과가 String 타입일 때 여러 결과 문자열을 하나로 합쳐주는 역할을 한다.
			//    파라미터가 없는 경우 : 문자열을 그대로 이어붙힌다.
			//    파라미터가 1개인 경우 (delimiter) : 각 문자열 사이에 구분자를 넣을 수 있다.
			//    파라미터가 3개인 경우 (delimiter, prefix, suffix) : 각 문자열 사이에 구분자를 넣고, 하나로 합쳐진 문자열 앞뒤에 문자열을 추가해 붙힌다.

			// 4) 이름을 뽑아 다양한 형태로 이어붙히기
			// 연산한 문자열을 하나의 문자열로 이어붙힌다.
			String name1 = personList.stream()
					.map(Customer::getName)   // Stream<String>
					.collect(Collectors.joining());
			System.out.println(name1);

			name1 = personList.stream()
					.map(Customer::getName)   // Stream<String>
					.collect(Collectors.joining("/"));
			System.out.println(name1);

			name1 = personList.stream()
					.map(Customer::getName)   // Stream<String>
					.collect(Collectors.joining(",", "[", "]"));
			System.out.println(name1);



			// Collectors.summarizingInt(), Collectors.summingInt(), Collectors.averagingInt()
			//   통계를 내어 최대값, 최소값, 개수, 합계, 평균을 구하거나
			//   직접 합계나 평균을 구하는 것이 가능하다.
			// Int, Double, Long 모두 지원

			// 5) 합계, 평균, 통계를 이용한 계산
			// TODO

			// Collectors.groupingBy()는 파라미터로 그룹핑 할 기준을 정해주면 해당 기준으로 데이터를 그룹핑한다.
			// 6) 데이터 그룹핑 (나이기준으로 데이터 그룹핑)
			//  groupingBy(Function)
			Map<Integer, List<Customer>> result = personList.stream()
					.collect(Collectors.groupingBy(c -> c.getAge() / 10 * 10));

			System.out.println(result);

			// Collectors.partitioningBy()는 파라미터로 Predicate를 받는다.
			// 따라서, 해당 조건을 통해 나온 True/False를 기준으로 결과 데이터를 두 파티션으로 나눈다.
			// 7-1)이름이 5글자보다 많은 경우 구분
			Map<Boolean, List<Customer>> result2 = personList.stream()
					.collect(Collectors.groupingBy(p -> p.getName().length() > 5));
			System.out.println(result2);

			// 7-2) 나이가 28살이 아닌 사람 구분
			// TODO
		}

		System.out.println("\n프로그램 종료");
	} // end main

	public static boolean match(List<String> list, String match){
		for (String string : list) {
			if (string.contains(match)) {
				return true;
			}
		}
		return false;
	} // end match()



} // end class





