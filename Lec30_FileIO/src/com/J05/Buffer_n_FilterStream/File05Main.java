package com.J05.Buffer_n_FilterStream;

/* Buffered Stream + Buffer 예제
Program <=== FilterInputStream <=== InputStream <=== Source
					↓ 상속					↓ 상속
Program <=== BufferedInputStream <=== FileInputStream <=== File

Program ===> FilterOutputStream ===> OutputStream ===> Source
					↓ 상속					↓ 상속
Program ===> BufferedOutputStream ===> FileOutputStream ===> File

java.io.InputStream
 |__ java.io.FilterInputStream
      |__ java.io.BufferedInputStream

java.io.OutputStream
 |__ java.io.FilterOutputStream
      |__ java.io.BufferedOutputStream
*/

import java.io.*;

public class File05Main {

	public static void main(String[] args) {
		System.out.println("Buffered Stream + Buffer");
		
		// TODO:
		// file03 패키지 참조
		// try with resource 구문으로 작성
		// in.read(buff) --> bin.read(buff);
		// out.write( , , ) --> bout.write( , , ); 사용
		// finally 필요 없슴


		try(
				InputStream in = new FileInputStream("temp/big_text.txt");
				BufferedInputStream bin = new BufferedInputStream(in); // 장착!
				OutputStream out = new FileOutputStream("temp/copy_big_text.txt");
				BufferedOutputStream bout = new BufferedOutputStream(out);  // 장착
		){
			byte[] buff = new byte[1024];   // 버퍼 준비

			int lengthRead = 0;  // 읽은 바이트 개수
			int byteCopied = 0;

			long startTime = System.currentTimeMillis();

			while((lengthRead = bin.read(buff)) != -1){
//				lengthRead = bin.read(buff);
//				if(lengthRead == -1) break;

				bout.write(buff, 0, lengthRead);  // 직전에 읽어들인 데이터만큼 write
				byteCopied += lengthRead;
			}
			long endTime = System.currentTimeMillis();
			long elapsedTime = endTime - startTime;

			System.out.println("전체 복사한 바이트: " + byteCopied);
			System.out.println("경과 시간: " + elapsedTime);


		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		System.out.println("\n프로그램 종료");

	} // end main()

} // end class File05Main
















