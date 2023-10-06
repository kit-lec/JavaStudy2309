package com.J01.null체크문제;

import common.Address;
import common.User;

/* 자바의 가장 큰 고질적인 문제 => null 체크
 * 	NPE (NullPointerException) 을 피하려면 꼭 null 여부 체크 필요
 */

public class Optional01Main {

	public static void main(String[] args) {
		System.out.println("null check");

		User user1 = new User();
		// TODO

		User[] arr = new User[3];
		User user2 = arr[0];

		// TODO

		System.out.println("\n프로그램 종료");
	} // end main()

	public static void userInfo1(User user) {
		System.out.println(user);
	}

	public static void userInfo2(User user) {
		System.out.println(user.getAddress());
	}

	public static void userInfo3(User user) {
		// 자바는 NPE 방어하기 위한 방어코드가 필수다!
		// TODO
	}

	public static void userStreet(User user) {
		//  null 체크 때문에 지저분해진 코드

		// TODO

		System.out.println("street 없슴");
	}

} // end class






















