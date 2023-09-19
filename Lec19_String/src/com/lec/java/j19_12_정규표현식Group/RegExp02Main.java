package com.lec.java.j19_12_정규표현식Group;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 그룹(group) 
 * 정규표현식에 () 을 사용하여  패턴 내에서 '그룹'을 지정 하면
 * () 의 개수만큼 그룹이 만들어진다.
 */
public class RegExp02Main {

	public static void main(String[] args) {
		System.out.println("정규표현식 : group");
		
		String input;
		String regex;
		Pattern pat;
		Matcher matcher;
		
		System.out.println();
		regex = "(My)(....)";  // 정규표현식에 () 사용
		pat = Pattern.compile(regex);
		
		input = "-My98KK-myABCD--My1234567--MyZZ---My789";
		
		matcher = pat.matcher(input);
		
		// TODO
		
		
		// 도우미 함수를 사용해보자
		System.out.println();
		// TODO
		
		
		System.out.println("프로그램 종료");
	} // end main
	
	// 도우미 함수
	// TODO
	
} // end class

























