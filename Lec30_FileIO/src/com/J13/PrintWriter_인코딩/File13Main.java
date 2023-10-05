package com.J13.PrintWriter_인코딩;

/* PrintWriter / 인코딩 
 * 
 * java.lang.Object
 *  └─ java.io.Writer
 *      └─ java.io.PrintWriter
 *  
 *  텍스트 파일 작성시는 PrintWriter 객체 편리
 *  	println(), print(), printf() ..
 *  텍스트 파일 읽을시는 BufferedReader 객체 편리
 *  	read(), read(버퍼), readLine()..
 *  
 *  PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("파일명" 혹은 File)));
 *  PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("파일명" 혹은 File))));
 *  
 *  BufferedReader br = new BufferedReader(new FileReader("파일이름" 혹은 File));
 *  BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("파일이름" 혹은 File))));
 *  BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("파일이름" 혹은 File)));
 *  
 *  ★ 문자기반 출력시 꼭 끝에 flush() 해주자 ★
 * 
 *  인코딩 문제 
 *  	FIleReader, FileWriter 는 파일의 인코딩을 무조건 file.encoding 값으로 간주한다.
 * 		(ex: LINUX 는  UTF-8,  MacOS 는 한글상위의 경우 euc-kr, 윈도우즈는 Java 소스코드 인코딩 영향) 
 *  	
 *  인코딩 설정하기
 *  	InputStreamReader, OutputStreamWriter 를 사용해서 인코딩 변경을 해야 한다.
 *  
 *  	BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("파일이름" 혹은 File),"인코딩"));
 *  	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("파일이름" 혹은 File), "인코딩"));
 *   
 *  인코딩 : "UTF8", "euc-kr"
 *   
*/

import java.io.*;

public class File13Main {
	
	private static final String FILE1 = "temp/PrintData.txt";
	private static final String FILE2 = "temp/PrintData_euckr.txt";
	
	public static void main(String[] args) {
		System.out.println("PrintWriter / 인코딩 ");

		FileWriter fw = null;
		FileReader fr = null;

		BufferedReader br = null;
		BufferedWriter bw = null;

		PrintWriter out = null;

		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter(FILE1)));
			test_write(out);

			br = new BufferedReader(new InputStreamReader(new FileInputStream(FILE1)));
			test_read(br);

			System.out.println("현재 OS인코딩 " + System.getProperty("file.encoding"));

			//---------------------------------------
			out.close();
			br.close();
			//---------------------------------------

			// euc-kr 로 인코딩 하여 저장
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FILE2), "euc-kr")));
			test_write(out);
			System.out.println();

			// euc-kr 로 디코딩하여 읽기
			br = new BufferedReader(new InputStreamReader(new FileInputStream(FILE2), "euc-kr"));
			test_read(br);

		} catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
			out.close();

			try {
				if(br != null) br.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		}
		
		System.out.println("\n프로그램 종료");
		
	} // end main()

	private static void test_read(BufferedReader br) throws IOException {

		String line;
		StringBuffer sb = new StringBuffer();
		while((line = br.readLine()) != null){
			sb.append(line + "\n");
		}
		System.out.println(sb);
	}

	private static void test_write(PrintWriter out) {
		out.println("안녕하세요 Java 한글이 잘 보이나요?");
		out.print((2000 + 20) + " " + 3.14);
		out.println();
		out.printf("%d-%d-%d\n", 2020, 3, 2);
		out.flush();   // ★
	}

	// TODO
	
} // end class
