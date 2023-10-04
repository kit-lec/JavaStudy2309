package com.lec.java.j23_06_LocalInnerClass연습;

public class Local02Main {

	public static void main(String[] args) {
		System.out.println("Local 내부 클래스의 활용");

		Person person = new Person("ABC");
		person.readAge(10);
		person.readAge(47);

		MyReadable r = person.createInstance(16);
		r.readInfo();

	} // end main()

} // end class Local02Main














