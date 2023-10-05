package com.J03.Buffer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 java.io.InputStream
  |__ java.io.FileInputStream
 java.io.OutputStream
  |__ java.io.FileOutputStream
*/

public class File03Main {

	public static void main(String[] args) {
		System.out.println("File IO 2");
		
		// Java 7부터 도입된 try-with-resource
		// try (리소스 생성) { ... }
		// catch (exception ) { ... }
		// 리소스를 close하는 코드가 없어도 자동으로 close가 실행
		//
		// java.lang.AutoCloseable 나 
		//  └─ java.io.Closeable 을 상속받은 어떠한 객체라도 
		//  try(리소스 생성) 안에 '선언' 되어 있으면
		//  try~catch 가 끝나기 전에 close() 됨.
		
		// InputStream, OutputStream 둘다 Closeable 을 상속(implements) 한다
		
	
		// TODO
		
		System.out.println("\n프로그램 종료");
		
	} // end main()

} // end class
















