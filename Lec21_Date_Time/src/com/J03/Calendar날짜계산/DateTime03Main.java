package com.J03.Calendar날짜계산;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* Calendar 객체를 사용한 시간 및 날짜 연산
 *  
 */
public class DateTime03Main {

	public static void main(String[] args) {
		System.out.println("날짜, 시간 연산");

		Calendar cal = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		Date date = null;
		
		//-------------------------------------------------------
		System.out.println("현재 시간에서 날짜 더하고 빼기");
		
        // TODO
		
        //-------------------------------------------------------
        System.out.println();
        System.out.println("특정 날짜에 더하고 빼기");
        
        // TODO
        
        //-------------------------------------------------------
        System.out.println();
        System.out.println("날짜 두개 더하기");
        // 두개의 Date를 더하려면 두개의 Calendar를 사용해야 합니다. 

        // TODO        
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class











