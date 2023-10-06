package com.J03.reduce;

import common.Customer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/** reduce() 연산 [최종연산]
 *
 *  전달된 스트림의 데이터에서
 *  '2개'를 소모하며 결괏값 '1개'를 리턴하는 'reduce 연산'(BinaryOperator)을 반복 수행 하며 개수를 감소시킨다.
 *  최종적으로 '한개' 까지 reduce 되면 그 값을 리턴한다.
 *
 *  리턴값
 * 		초깃값이 없으면 Optional<T> 리턴
 * 		초깃값이 있으면 초깃값 타입 리턴
 *
 *  입력 =>  출력
 *  n개 =>  1개
 *
 *  reduce(BinaryOperator<T>)
 * 	reduce(Identity, BinaryOperator<T>)
 * 	  매개변수
 * 	     Identidy: 초깃값
 * 	     BinaryOperator: reduce 연산로직
 *
 *  기존의 주어진 연산 (count, sum 등..) 이 아닌 연산을 Stream 에 수행할때 필요
 *
 * ※ 데이터 연산 3대장
 *  	map : n -> n
 *  	filter : n -> n' ( <= n)
 *  	reduce : n -> 1
 */


public class Stream03Main {

	public static void main(String[] args) {
		System.out.println("-".repeat(30) +"\n▶ reduce()");
		{
			int [] arr = {1, 2, 3, 4, 5};

			// 초깃값을 안 준 경우
			// TODO

			// 초깃값을 준 경우
			// TODO

		}


		System.out.println();
		{
			// 문자열에서 길이가 가장 긴 문자열을 뽑아내기
			String [] greetings = {"안녕하세요~~~", "Hello", "Good morning", "반갑습니다"};
			String result;
			// TODO

		}


		System.out.println();
		{
			List<Customer> personList = List.of(
					new Customer("zayson", 28),
					new Customer("chaeyoung", 26),
					new Customer("maeng", 30)
			);

			// 나이가 28이하인 사람들의 나이의 합
			// TODO

			// 이름들만 묶어서 하나의 문자열 만들기
			// TODO
		}

		System.out.println("\n프로그램 종료");
	} // end main()

} // end class


// 직접 구현도 가능
// TODO











