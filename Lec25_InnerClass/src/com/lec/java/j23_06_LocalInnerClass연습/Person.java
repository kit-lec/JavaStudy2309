package com.lec.java.j23_06_LocalInnerClass연습;

public class Person {
	// Person 외부 클래스의 멤버 변수
	private String name;
	
	// Person 외부 클래스의 생성자
	public Person(String name) {
		this.name = name;
	}

	public void readAge(int age){

		//age = 40;

		class PersonWithAge {
			public void readInfo(){
				System.out.println("이름: " + name);
				System.out.println("나이: " + age);
			}
		} // end local inner

		PersonWithAge p = new PersonWithAge();
		p.readInfo();

	}
	
	
} // end class Person









