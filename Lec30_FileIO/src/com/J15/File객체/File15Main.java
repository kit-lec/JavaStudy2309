package com.J15.File객체;

import java.io.File;

public class File15Main {

	public static void main(String[] args) {
		System.out.println("디렉토리 정보 확인");
		System.out.println();
		// current working directory : 현재작업경로
		String curWorkingDir = System.getProperty("user.dir");
		System.out.println("현재 작업 폴더: " + curWorkingDir);
		
		System.out.println();
		// 현재 작업 디렉토리의 파일 리스트 출력
		// File 클래스: 파일(txt, doc, ...) 객체 또는 디렉토리(폴더) 객체
		File curDir = new File(curWorkingDir);
		File[] list = curDir.listFiles();
		// listFiles(): 디렉토리 안에 있는 파일과 디렉토리들을 File[] 배열로 리턴

		for(var f : list){
			if(f.isDirectory()){
				// isDirectory(): File 객체가 '디렉토리'이면 true 리턴
				// isFile(): File 객체가 '파일'이면 true 리턴
				System.out.print("DIR\t");
			} else {
				System.out.print("FILE\t");
			}

			System.out.print(f.getName() + "\t");  // getName()파일/디렉토리 이름
			System.out.println(f.length());  // length() 파일의 크기 (byte)
											// 디렉토리의 경우 length() 값은 의미없다
		}

		
		System.out.println();
		// 특정 디렉토리의 내용 출력, enhanced for 문 이용
		File tempDir = new File("temp");  // 상대경로

		for(var f : tempDir.listFiles()){
			if (f.isFile()) {
				System.out.print("FILE" + "\t");
			} else {
				System.out.print("DIR" + "\t");
			}

			System.out.print(f.getName() + "\t");
			System.out.println(f.length());
		}
		
		System.out.println();
		// 파일 하나에 대한 정보
		File f = new File("dummy.txt");  // 새로운 File 객체 하나 생성함
		// new File() 했다 하여, 실제 물리적으로 파일을 생성하는 것이 아니다!!

		System.out.println("파일이름(상대경로): " + f.getName());  // 상대경로
		System.out.println("절대경로: " + f.getAbsoluteFile());  // 절대경로
		System.out.println("있니? " + f.exists());  // 물리적으로 존재하는지 여부
		
		System.out.println("\n프로그램 종료");
		
	} // end main()

} // end File11Main

















