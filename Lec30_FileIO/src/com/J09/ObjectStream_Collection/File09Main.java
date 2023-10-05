package com.J09.ObjectStream_Collection;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

// Object Filter Stream + Collection

// Program <=== ObjectInputStream <=== FileInputStream <=== File
// Program ===> ObjectOutputStream ===> FileOutputStream ===> File

// ArrayList<> 와 같은 Collection 에서,
// 모든 데이터들이 Serializable 되어 있으면 ObjectInputStream / ObjectOutputStream 으로
// read/write 가능.

public class File09Main {
	
	public static final String FILEPATH  = "temp/member2.dat";

	public static void main(String[] args) {
		System.out.println("Object Filter Stream");

		try (
				OutputStream out = new FileOutputStream(FILEPATH);
				ObjectOutputStream oout =
						new ObjectOutputStream(out);
				InputStream in = new FileInputStream(FILEPATH);

				ObjectInputStream oin =
						new ObjectInputStream(in);
		){
			// 리스트 준비
			List<Member> list = new ArrayList<>();

			// 파일에 쓸 데이터 객체 생성
			Member m1 = new Member("root", "root1234");
			Member m2 = new Member("guest", "guest");
			Member m3 = new Member("admin", "admin123456");

			// TODO

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일 끝까지 읽었습니다.");
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		System.out.println("\n프로그램 종료");
		
	} // end main()

} // end class File08Main
















