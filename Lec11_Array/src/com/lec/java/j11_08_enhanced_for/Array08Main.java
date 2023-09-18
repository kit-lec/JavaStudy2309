package com.lec.java.j11_08_enhanced_for;

/* Enhanced for (향상된 for) 문
 	
 	for (배열타입 변수 : 배열이름) { ... }
 	
 */
public class Array08Main {

	public static void main(String[] args) {
		System.out.println("Enhanced for (향상된 for) 문");
		
		int[] arr = {11, 22, 33, 44, 55};

		for(int x : arr){
			System.out.print(x + " ");
		}
		System.out.println();

		for(var x : arr){
			System.out.print(x + " ");
		}
		System.out.println();

		System.out.println();
		
		int[][] array = {
				{1, 2},
				{3, 4, 5, 6},
				{7, 8, 9},
		};

		System.out.println();
		for (int[] row : array) {
			for(int x : row){
				System.out.print(x + " ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class Array10Main









