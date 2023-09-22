package com.lec.java.j14_01_access;


/**
 * Modifier (제어자, 수식어, 제한자..)
 *   클래스나  변수, 메소드의 선언부에 붙여주어 부가적인 제어를 하게끔 함
 *
 *   Access modifier (접근제한자)
 *        private, protected, public.
 *
 *   그밖의 modifier 들
 *        final, static, abstract, transient, synchronized, volatile
 */

/**
 * 접근권한 수식어(Access Modifier)  접근제한자
 *  1) 종류: private, (default), protected, public
 *  2) 기능
 *    - 멤버 변수, 멤버메소드에 대한 접근 권한을 제한
 *
 *  3) private: '자기자신'이 선언된 클래스에서만 사용 가능
 *  4) (default): '자기자신' + '같은 패키지'에 있는 클래스들에서는사용 가능
 *  5) protected: '자기자신' + '같은 패키지' + '상속받은 클래스' 에서 사용 가능
 *          다른 패키지의 클래스라도 '상속 받으면' 사용 가능하다
 *  6) public: 어디서든 사용이 가능
 *
 *  사용범위: private < (default) < protected < public
 *
 * ※ 클래스에 붙는 접근제한자는 딱 두가지 입니다
 *  (default) , public
 */

public class Access01Main {

	public static void main(String[] args) {
		System.out.println("접근권한 수식어(Access Modifier)");
		
		
	} // end main()

} // end class Access01Main










