package practice.capitalize;

import java.util.Scanner;

/* LetterCapitalize
 * 	문장을 입력하고,  단어의 앞 문자를 대문자로 만들어 출력하기를 반복하다가
 *  quit 을 입력 받으면 종료하기
 * 
 * 	[입력예]
 * 		hello my WORLD
 *  [출력예]
 * 		Hello My World  
 */

public class LetterCapitalize {
	
	// TODO : 필요한 메소드 있으면 추가 작성
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str;
		String[] words;

		while(true){
			str = sc.nextLine().trim();
			if(str.equalsIgnoreCase("quit")) break;

			// 소문자로 변환
			str = str.toLowerCase();
			words = str.split("\\s+");  // 공백기준 단어 구분

			String result = "";
			for(var word : words){
				String first = word.substring(0, 1).toUpperCase();   // 단어의 첫글자를 대문자로
				String rest = word.substring(1);  // 나머지
				result += first + rest + " ";
			}
			System.out.println(result.trim());

		}
		
		sc.close();
	} // end main()
} // end class










