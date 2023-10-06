package com.J14.SystemProperty;

/*
	시스템 속성 (property) -> 애플리케이션에서 사용
		System.getProperty(key)
		System.setProperty(key, value)   : ← 런타임에 조작 가능

		Windows 환경에서는 SET 명령으로, Unix 계열에선 EXPORT 명령으ㄹ 설정 가능
		Java 명령행옵션에 -Dname=value

		★ 실무에서는 계정정보 와 같이 보안에 민감한 내용은 코드에 직접 작성하지 않는다.
		  서비스 하는 운영체제나 런타임 환경의 시스템 '속성'에 저장(key-value)한 다음.
		 코드에서는 해당 속성의 key 값을 불러와서 사용하는 방식으로 동작한다.

	환경변수 (Environment variable) -> OS 에서 사용
		System.getenv()


    차이점
        - 시스템 속성은 런타임에 추가 가능.   환경변수는 불가
        - 시스템 속성은 추가된 프로세스에서 액세스할 수 있지만 모든 프로세스는 환경 변수에 액세스할 수 있습니다.
 */
public class File14Main {

	public static void main(String[] args) {
		System.out.println("시스템 정보 확인");

		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.arch"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("java.version"));

		System.out.println(System.getenv("path"));

		System.out.println(System.getProperty("db"));  // 없으면 null
		System.setProperty("db", "mydatabase");
		System.out.println(System.getProperty("db"));

		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("password"));

		// 현재 작업 경로 (current working directory)
		System.out.println(System.getProperty("user.dir"));

		// user home directory("내 문서"가 있는 폴더)
		System.out.println(System.getProperty("user.home"));


		System.out.println("\n프로그램 종료");
		
	} // end main()

} // end class














