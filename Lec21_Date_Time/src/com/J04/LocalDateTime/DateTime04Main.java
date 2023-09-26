package com.J04.LocalDateTime;

/*
 * java.time 패키지
 * 	- JAVA8 부터 도입
 * 	- 날짜 + 시간을 '조작' '비교' 등을 하는 기능을 추가한 객체들
 *  
 *  날짜와 시간을 표현하는 클래스들
 *  LocalDate	로컬 날짜 클래스 
 *  LocalTime	로클 시간 클래스
 *  LocalDateTime  로컬 날짜 및 시간클래스 (LocalDate + LocalTime)
 *  
 *  https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html
 *  
 *  
 *  ★이제 가급적 java.time 객체를 사용하자!  구 Date, Calendar 의 문제점!★
 *  
 *  - Date 클래스: time zone 기능 없슴.. format 기능 없슴.. calendar 기능 없슴.
 *   	특정 시점의 날짜 정보 '저장'정도 밖에 못함. 대부분 메소드는 deprecated 됨
 *   
 *	- Calendar 클래스 :  날짜, 시간에 대해 '조작', '비교' 하는 기능이 불충분
 *		월 month 값 설계 오류.  Calendar.OCTOBER 가 9 --> 혼란 야기
 *
 *	- Date, Calendar 둘다 immutable 이 아님 (mutable) 임.
 *		--> 멀티쓰레드 환경에서 언제든 문제 발생 가능.
 *	
 *	- 결정적으로 나중에 스프링, 웹어플리케이션등 제작에서 java.time 을 사용하는 것이 훨씬 수월해진다.
 *	  LocalDate 와 LocalDateTime 이 데이터베이스에 제대로 매핑이 되지 않는 이슈도 Hibernate 5.2.10 버젼에서 해결.   (스프링부트 2.x 버젼에서는 해당버젼 사용중)
 *    MyBatis 3.4.5 부터도 매핑 지원 내장됨. https://mybatis.org/mybatis-3/ko/configuration.html#typeAliases
 *
 *  - 참조 : https://d2.naver.com/helloworld/645609
 */
public class DateTime04Main {

	public static void main(String[] args) {
		System.out.println("-- java.time --");
		
		System.out.println("\nLocalDate");
		// now() 현재 날짜
		// TODO
		
		// of(year, month, dayOfMonth) 주어진 날짜
		// TODO
		
		System.out.println("\nLocalTime");
		// TODO
		
		// of(hour, minute, second, nanoOfSecond) 주어진 시간
		// TODO
		
		System.out.println("\nLocalDateTime");
		// TODO

				
		System.out.println("\nDateTimeFormatter 사용");
		// java.time.DateTimeFormatter 를 사용하여 원하는 포맷으로 출력
		// LocalDateTime => String
		// TODO

		// String => LocalDateTime
		// TODO
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class

















