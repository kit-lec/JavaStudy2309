package com.J02.Calendar객체;

import java.util.Calendar;

/*
   Calendar 객체
   
   Calendar 는 추상클래스다.  그래서 new로 생성 불가.
     날짜와 시간을 계산하는 방식(역법) 지역, 문화, 나라에 따라 다르기 때문에
     이를 상속받아 개별적으로 구현함
   
   Calendar 는 날짜/시간을 계산하는 꼭 필요한 메소드만 제공하고
     특정한 역법(날싸 시간계산 ex: 음력) 은 상속받은 클래스에서 구현
   
     특별히 상속할 필요 없으면 getInstance() static 메소드 호출
 */
public class DateTime02Main {

	public static void main(String[] args) {
		System.out.println("Calendar객체로 날짜 다루기");
		
		//  특별한 역법을 쓰지 않는 경우.  우리나라 서력 사용.
		// TODO
		
		System.out.println("get() 으로 날짜/시간 받아오기");
		System.out.println("현재:");
		// TODO

		System.out.println();
		System.out.println("TimeZone");
		
		// TODO

		
		System.out.println();
		// 시간대 문자열들 획득
		// TODO
		
		
		System.out.println();
		System.out.println("Date ↔ Calendar 변환");
		// 상호간에 변환할 일이 생긴다..
		
		// 1-1. Calendar -> Date
		// TODO		
		
		// 1-2 Calendar -> Date
		// TODO
		
		// 2. Date -> Calendar
		// TODO
		
		// 오늘날 우리 대한민국이 쓰는 달력은 GregorianCalendar(국제표준시) 이며
		// 이는 Calendar 를 상속받은 클래스입니다.
		// 기본적으로 시스템 설정 시각 (서울)으로 되어 있으며
		// Locale 값을 설정하면 특정 지역 시각을 알수 있습니다.
		System.out.println();
		System.out.println("GregorianCalendar 사용");
		// TODO

		
	} // end main()
	
	public static void printDate(Calendar now) {
		
		// TODO
		
	} // end printDate()
	
	
} // end class
