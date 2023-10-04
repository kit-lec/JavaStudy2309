package com.lec.java.j23_07_AnonymousClass;

public class Person {
	
	// 외부 클래스 멤버변수
	private String name;
	
	// 외부 클래스 생성자
	public Person(String name) {
		this.name = name;
	}

	public MyReadable createInstance(int age){

		return new MyReadable() {
			@Override
			public void readInfo() {
				System.out.println("이름: " + name);
				System.out.println("나이: " + age);
			}
		};
	}
	
} // class Person

interface  MyReadable {
	void readInfo();
}








