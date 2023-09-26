package com.lec.java.j18_06_throws;

/* throws
	 메소드 설계를 할 때 예외 처리를 직접 하지 않는 경우:
	 메소드 이름 뒤에 throws Exception을 추가하면,
	 예외가 발생한 경우에는 메소드를 호출한 곳으로 exception이 던져짐.
	 'Exception' 및 이를 '직접 상속받은' Exception 을 throws 하는 메소드의 경우,
	 이 메소를 호출하는 쪽에서 반.드.시 예외 처리 (handling) 해야 한다. 안하면 에러!
	 	(이를 'checked exception' 이라 한다)

	반면 'RuntimeException' 및 이를 상속받은 예외를 throws 하는 메소드는
	굳이 호출하는 쪽에서 매번 예외 처리 할 필요는 없다
	    (이를 'unchecked exception' 이라 한다)
 */
public class Exception06Main {

	public static void main(String[] args) /*throws Exception*/ /* TODO */ {
		System.out.println("throws");
		
		System.out.println();
		TestClass test = new TestClass();
		int result = test.divide(123, 0);
		System.out.println("result = " + result);


		try {
			test.divide2(123, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}

		//test.divide2(111, 0);

		// 만약에 try-catch 안할거면 main 메소드가 throws Exception 을 해줘야 한다.
		// main() 메소드는 가상머신이 호출하는 메소드이다.  예외상황 처리는 가상머신에게 넘어간다
		// 가상머신의 예외처리 순서
		//    1 : getMessage 호출
		//    2 : 예외상황이 발생해서 전달되는 과정 출력
		//	  3 : 프로그램 종료

		//test.divide3(222, 0);

		//Thread.sleep(1000);


		System.out.println("프로그램 종료...");

	} // end main()

} // end class Exception06Main












