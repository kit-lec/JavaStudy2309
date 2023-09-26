package com.J01.Date객체;

/* 자바에서 날짜/시간을 다루는 객체들
 * java.util.Date (JDK 1.0 부터..)
 * 		├ java.sql.Date
 * 		├ java.sql.Time
 * 		└ java.sql.Timestamp
 * 
 * java.util.Calendar (JDK 1.1 부터..)
 * java.time.* 패키지 (JDK 1.8 (Java8) 부터..)
 * 
 * 지금은 java.time 패키지만으로 충분하긴 하나.. 
 * 오랜시간 Date, Calendar 를 사용하여 만들었으므로 이 또한 알긴 알아야 한다
 * 
 */
public class DateTime01Main {

	public static void main(String[] args) throws Exception{
		System.out.println("Date객체로 날짜 다루기");

		// 현재 날짜 얻어오기,  생성자가 현재 날짜, 시간을 얻어온다.
		// TODO
		
		System.out.println("1. Date 의 toString() 사용한 출력");
		// TODO
		
		System.out.println();
		System.out.println("2. Date 의 get..()을 사용한 출력");
		// Date객체의 대부분의 메소드들은 현재 deprecated 됨.
		// TODO		
		
		System.out.println();
		System.out.println("3. SimpleDateFormat 사용한 출력");
		// TODO
		
		// yyyy-MM-dd hh:mm:ss 형식 출력
		// 포맷에 사용되는 문자열 종류 : 자바의 정석 교재 p544
		// H: 시간 (0~23),  h : 시간 (1~12)
		// TODO
		
		// ※ 현재 Date() 객체는 생성자를 제외하고는 거의다 deprecated 되어 있다.
		
		System.out.println();
		System.out.println("Date 테스트");
		// TODO
		
				
		
		// 문자열을 Date 타입으로 파싱하기
		System.out.println();
		System.out.println("문자열 -> Date");
		String oldstring = "2018-08-16 14:21:52.3";
		// TODO
		
		
		// 경과시간 체크하기
		System.out.println();
		System.out.println("경과시간");
		// TODO
		
		
		System.out.println();
		System.out.println("millisec -> time");
		// TODO

		
	} // end main()

} // end class
